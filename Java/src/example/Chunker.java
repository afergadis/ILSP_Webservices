package example;

import gr.ilsp.nlp.webservices.ilsp_chunker.IlspChunker;
import gr.ilsp.nlp.webservices.ilsp_chunker.IlspChunkerService;
import gr.ilsp.nlp.webservices.ilsp_chunker.JobId;

import javax.xml.ws.Holder;
import java.io.UnsupportedEncodingException;

/**
 * @author Aris Fergadis
 * @version 0.1
 * @since 9/7/2015
 */
public class Chunker {

    private final IlspChunker service;
    private String inputType;
    private String outputType;
    private String inputUrl;
    private String language;
    private Boolean inputIsURLlist;
    private Holder<String> report;
    private Holder<Long> detailedStatus;
    private Holder<byte[]> output;
    private Holder<String> outputUrl;
    private Holder<String> outputList;
    private Holder<String> outputListUrl;

    public Chunker() {
        service = new IlspChunkerService().getIlspChunkerPort();

        inputUrl = "";
        inputType = "xceslemma";
        outputType = "xmicas";
        language = "el";
        inputIsURLlist = false;

        report = new Holder<>();
        detailedStatus = new Holder<>();
        output = new Holder<>();
        outputUrl = new Holder<>();
        outputList = new Holder<>();
        outputListUrl = new Holder<>();
    }

    public static void main(String[] args) {
        IlspNLP ilspNLP = new IlspNLP();
        Chunker chunker = new Chunker();

        String text = "Η Αττική είναι ιστορική περιοχή της Ελλάδας που σήμερα αποτελεί μία από τις 13 περιφέρειες της χώρας.";
        ilspNLP.process(text);
        chunker.chunk(ilspNLP.getOutput());
        System.out.println(chunker.getOutput());
    }

    public void chunk(String inputDirectData, String inputUrl, String language,
                      String inputType, String outputType, Boolean inputIsUrlList) {
        String run = service.run(inputDirectData, inputUrl, language, inputType, outputType, inputIsUrlList);
        JobId jobId = new JobId();
        jobId.setJobId(run);
        System.out.println(Chunker.class.getCanonicalName() + ": " + service.getStatus(jobId));
        service.waitfor(jobId);
        System.out.println(Chunker.class.getCanonicalName() + ": " + service.getStatus(jobId));
        service.getResults(jobId, report, detailedStatus,
                output, outputUrl, outputList, outputListUrl);
    }

    public void chunk(String inputDirectData) {
        chunk(inputDirectData, inputUrl, language, inputType, outputType, inputIsURLlist);
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public String getInputUrl() {
        return inputUrl;
    }

    public void setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getInputIsURLlist() {
        return inputIsURLlist;
    }

    public void setInputIsURLlist(Boolean inputIsURLlist) {
        this.inputIsURLlist = inputIsURLlist;
    }

    public String getReport() {
        return report.value;
    }

    public Long getDetailedStatus() {
        return detailedStatus.value;
    }

    public String getOutput() {
        String out = null;
        try {
            out = new String(output.value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return out;
    }

    public String getOutputUrl() {
        return outputUrl.value;
    }

    public String getOutputList() {
        return outputList.value;
    }

    public String getOutputListUrl() {
        return outputListUrl.value;
    }
}

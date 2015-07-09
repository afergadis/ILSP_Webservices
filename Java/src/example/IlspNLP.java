package example;

/**
 * @author Aris Fergadis
 * @version 0.1
 * @since 9/7/2015
 */

import gr.ilsp.nlp.webservices.ilsp_nlp.IlspNlp;
import gr.ilsp.nlp.webservices.ilsp_nlp.IlspNlpService;
import gr.ilsp.nlp.webservices.ilsp_nlp.JobId;

import javax.xml.ws.Holder;

/**
 * @author: Aris Fergadis
 * @date: 28/2/2015
 * @version: 0.1
 */
public class IlspNLP {

    private final IlspNlp service;
    private final Holder<String> report;
    private final Holder<Long> detailedStatus;
    private final Holder<String> output;
    private final Holder<String> outputUrl;
    private final Holder<String> outputList;
    private final Holder<String> outputListUrl;
    private final Holder<byte[]> outputArchive;
    private final Holder<String> outputArchiveUrl;
    private String inputType;
    private String outputType;
    private String inputUrl;
    private String inputEncoding;
    private String language;
    private Boolean inputIsURLlist;

    public IlspNLP() {
        service = new IlspNlpService().getIlspNlpPort();
        // Input
        inputType = "txt";
        outputType = "xceslemma";
        inputUrl = "";
        inputEncoding = "UTF-8";
        language = "el";
        inputIsURLlist = false;

        // Output
        report = new Holder<String>();
        detailedStatus = new Holder<Long>();
        output = new Holder<String>();
        outputUrl = new Holder<String>();
        outputList = new Holder<String>();
        outputListUrl = new Holder<String>();
        outputArchive = new Holder<byte[]>();
        outputArchiveUrl = new Holder<String>();
    }

    public static void main(String[] args) {
        IlspNLP ilspNLP = new IlspNLP();
        ilspNLP.process("Η Αττική είναι ιστορική περιοχή της Ελλάδας που σήμερα αποτελεί μία από τις 13 περιφέρειες της χώρας.");
        System.out.println(ilspNLP.getOutput());
    }

    public void process(String text) {
        String run = service.run(inputType, outputType, text, inputUrl, inputEncoding, language, inputIsURLlist);
        JobId jobId = new JobId();
        jobId.setJobId(run);
        System.out.println(IlspNLP.class.getCanonicalName() + ": " + service.getStatus(jobId));
        service.waitfor(jobId);
        System.out.println(IlspNLP.class.getCanonicalName() + ": " + service.getStatus(jobId));
        service.getResults(jobId, report, detailedStatus, output, outputUrl,
                outputList, outputListUrl, outputArchive, outputArchiveUrl);
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

    public String getInputEncoding() {
        return inputEncoding;
    }

    public void setInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
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
        return output.value;
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

    public byte[] getOutputArchive() {
        return outputArchive.value;
    }

    public String getOutputArchiveUrl() {
        return outputArchiveUrl.value;
    }
}

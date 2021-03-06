
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.jws.*;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01
 * Generated source version: 2.2
 */
@WebService(name = "ilsp_nlp", targetNamespace = "http://soaplab.org/getstarted/ilsp_nlp")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface IlspNlp {


    /**
     * starts a job and returns its job identifier
     *
     * @param inputIsURLlist
     * @param inputDirectData
     * @param inputUrl
     * @param inputEncoding
     * @param inputType
     * @param outputType
     * @param language
     * @return returns java.lang.String
     */
    @WebMethod(action = "run")
    @WebResult(name = "jobId", targetNamespace = "")
    @RequestWrapper(localName = "run", targetNamespace = "http://soaplab.org/ilsp_nlp", className = "gr.ilsp.nlp.webservices.ilsp_nlp.AppInputs")
    @ResponseWrapper(localName = "runResponse", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.RunResponse")
    public String run(
            @WebParam(name = "InputType", targetNamespace = "")
            String inputType,
            @WebParam(name = "OutputType", targetNamespace = "")
            String outputType,
            @WebParam(name = "input_direct_data", targetNamespace = "")
            String inputDirectData,
            @WebParam(name = "input_url", targetNamespace = "")
            String inputUrl,
            @WebParam(name = "InputEncoding", targetNamespace = "")
            String inputEncoding,
            @WebParam(name = "language", targetNamespace = "")
            String language,
            @WebParam(name = "inputIsURLlist", targetNamespace = "")
            Boolean inputIsURLlist);

    /**
     * starts a job, waits until it is completed and
     * returns the job results
     *
     * @param outputArchiveUrl
     * @param detailedStatus
     * @param inputDirectData
     * @param inputIsURLlist
     * @param outputUrl
     * @param outputList
     * @param inputEncoding
     * @param outputListUrl
     * @param outputArchive
     * @param inputUrl
     * @param inputType
     * @param report
     * @param outputType
     * @param language
     * @param output
     */
    @WebMethod(action = "runAndWaitFor")
    @RequestWrapper(localName = "runAndWaitFor", targetNamespace = "http://soaplab.org/ilsp_nlp", className = "gr.ilsp.nlp.webservices.ilsp_nlp.RunAndWaitFor")
    @ResponseWrapper(localName = "runAndWaitForResponse", targetNamespace = "http://soaplab.org/ilsp_nlp", className = "gr.ilsp.nlp.webservices.ilsp_nlp.RunAndWaitForResponse")
    public void runAndWaitFor(
            @WebParam(name = "InputType", targetNamespace = "")
            String inputType,
            @WebParam(name = "OutputType", targetNamespace = "")
            String outputType,
            @WebParam(name = "input_direct_data", targetNamespace = "")
            String inputDirectData,
            @WebParam(name = "input_url", targetNamespace = "")
            String inputUrl,
            @WebParam(name = "InputEncoding", targetNamespace = "")
            String inputEncoding,
            @WebParam(name = "language", targetNamespace = "")
            String language,
            @WebParam(name = "inputIsURLlist", targetNamespace = "")
            Boolean inputIsURLlist,
            @WebParam(name = "report", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> report,
            @WebParam(name = "detailed_status", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<Long> detailedStatus,
            @WebParam(name = "output", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> output,
            @WebParam(name = "output_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputUrl,
            @WebParam(name = "output_list", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputList,
            @WebParam(name = "output_list_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputListUrl,
            @WebParam(name = "output_archive", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<byte[]> outputArchive,
            @WebParam(name = "output_archive_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputArchiveUrl);

    /**
     * returns status of a given job
     *
     * @param jobId
     * @return returns java.lang.String
     */
    @WebMethod(action = "getStatus")
    @WebResult(name = "jobStatus", targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetStatusRequest")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.JobStatus")
    public String getStatus(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

    /**
     * terminates the specified job
     *
     * @param jobId
     */
    @WebMethod(action = "terminate")
    @Oneway
    @RequestWrapper(localName = "terminate", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.TerminateRequest")
    public void terminate(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

    /**
     * informs server that resources for the specified job can be cleared
     *
     * @param jobId
     */
    @WebMethod(action = "clear")
    @Oneway
    @RequestWrapper(localName = "clear", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.ClearRequest")
    public void clear(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

    /**
     * waits until the specified job terminates
     *
     * @param jobId
     */
    @WebMethod(action = "waitfor")
    @Oneway
    @RequestWrapper(localName = "waitfor", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.WaitforRequest")
    public void waitfor(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

    /**
     * returns all results of a given job
     *
     * @param outputArchive
     * @param outputArchiveUrl
     * @param detailedStatus
     * @param jobId
     * @param outputUrl
     * @param outputList
     * @param report
     * @param outputListUrl
     * @param output
     */
    @WebMethod(action = "getResults")
    @RequestWrapper(localName = "getResults", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetResultsRequest")
    @ResponseWrapper(localName = "getResultsResponse", targetNamespace = "http://soaplab.org/ilsp_nlp", className = "gr.ilsp.nlp.webservices.ilsp_nlp.AppResults")
    public void getResults(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId,
            @WebParam(name = "report", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> report,
            @WebParam(name = "detailed_status", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<Long> detailedStatus,
            @WebParam(name = "output", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> output,
            @WebParam(name = "output_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputUrl,
            @WebParam(name = "output_list", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputList,
            @WebParam(name = "output_list_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputListUrl,
            @WebParam(name = "output_archive", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<byte[]> outputArchive,
            @WebParam(name = "output_archive_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputArchiveUrl);

    /**
     * returns all results of a given job
     *
     * @param outputArchive
     * @param outputArchiveUrl
     * @param detailedStatus
     * @param jobId
     * @param outputUrl
     * @param outputList
     * @param report
     * @param resultName
     * @param outputListUrl
     * @param output
     */
    @WebMethod(action = "getSomeResults")
    @RequestWrapper(localName = "getSomeResults", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetSomeResultsRequest")
    @ResponseWrapper(localName = "getSomeResultsResponse", targetNamespace = "http://soaplab.org/ilsp_nlp", className = "gr.ilsp.nlp.webservices.ilsp_nlp.AppResults")
    public void getSomeResults(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId,
            @WebParam(name = "resultName", targetNamespace = "")
            List<String> resultName,
            @WebParam(name = "report", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> report,
            @WebParam(name = "detailed_status", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<Long> detailedStatus,
            @WebParam(name = "output", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> output,
            @WebParam(name = "output_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputUrl,
            @WebParam(name = "output_list", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputList,
            @WebParam(name = "output_list_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputListUrl,
            @WebParam(name = "output_archive", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<byte[]> outputArchive,
            @WebParam(name = "output_archive_url", targetNamespace = "", mode = WebParam.Mode.OUT)
            Holder<String> outputArchiveUrl);

    /**
     * returns a structured description of the service, in xml
     *
     * @return returns java.lang.String
     */
    @WebMethod(action = "describe")
    @WebResult(name = "description", targetNamespace = "")
    @RequestWrapper(localName = "describe", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.DescribeRequest")
    @ResponseWrapper(localName = "describeResponse", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.DescribeResponse")
    public String describe();

    /**
     * @param jobId
     * @return returns java.lang.String
     */
    @WebMethod(action = "getLastEvent")
    @WebResult(name = "event", targetNamespace = "")
    @RequestWrapper(localName = "getLastEvent", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetLastEventRequest")
    @ResponseWrapper(localName = "getLastEventResponse", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetLastEventResponse")
    public String getLastEvent(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

    /**
     * @param jobId
     * @return returns java.util.List<gr.ilsp.nlp.webservices.ilsp_nlp.ResultInfo>
     */
    @WebMethod(action = "getResultsInfo")
    @WebResult(name = "resultsInfoList", targetNamespace = "")
    @RequestWrapper(localName = "getResultsInfo", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetResultsInfoRequest")
    @ResponseWrapper(localName = "getResultsInfoResponse", targetNamespace = "http://soaplab.org/typedws", className = "gr.ilsp.nlp.webservices.ilsp_nlp.GetResultsInfoResponse")
    public List<ResultInfo> getResultsInfo(
            @WebParam(name = "jobId", targetNamespace = "")
            JobId jobId);

}

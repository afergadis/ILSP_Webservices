
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the gr.ilsp.nlp.webservices.ilsp_nlp package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Describe_QNAME = new QName("http://soaplab.org/typedws", "describe");
    private final static QName _RunAndWaitForResponse_QNAME = new QName("http://soaplab.org/ilsp_nlp", "runAndWaitForResponse");
    private final static QName _RunAndWaitFor_QNAME = new QName("http://soaplab.org/ilsp_nlp", "runAndWaitFor");
    private final static QName _Waitfor_QNAME = new QName("http://soaplab.org/typedws", "waitfor");
    private final static QName _GetResultsInfo_QNAME = new QName("http://soaplab.org/typedws", "getResultsInfo");
    private final static QName _Clear_QNAME = new QName("http://soaplab.org/typedws", "clear");
    private final static QName _GetResultsInfoResponse_QNAME = new QName("http://soaplab.org/typedws", "getResultsInfoResponse");
    private final static QName _GetSomeResultsResponse_QNAME = new QName("http://soaplab.org/ilsp_nlp", "getSomeResultsResponse");
    private final static QName _GetResultsResponse_QNAME = new QName("http://soaplab.org/ilsp_nlp", "getResultsResponse");
    private final static QName _GetLastEventResponse_QNAME = new QName("http://soaplab.org/typedws", "getLastEventResponse");
    private final static QName _Run_QNAME = new QName("http://soaplab.org/ilsp_nlp", "run");
    private final static QName _Terminate_QNAME = new QName("http://soaplab.org/typedws", "terminate");
    private final static QName _GetStatusResponse_QNAME = new QName("http://soaplab.org/typedws", "getStatusResponse");
    private final static QName _GetSomeResults_QNAME = new QName("http://soaplab.org/typedws", "getSomeResults");
    private final static QName _GetStatus_QNAME = new QName("http://soaplab.org/typedws", "getStatus");
    private final static QName _DescribeResponse_QNAME = new QName("http://soaplab.org/typedws", "describeResponse");
    private final static QName _GetLastEvent_QNAME = new QName("http://soaplab.org/typedws", "getLastEvent");
    private final static QName _RunResponse_QNAME = new QName("http://soaplab.org/typedws", "runResponse");
    private final static QName _GetResults_QNAME = new QName("http://soaplab.org/typedws", "getResults");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gr.ilsp.nlp.webservices.ilsp_nlp
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppResults }
     */
    public AppResults createAppResults() {
        return new AppResults();
    }

    /**
     * Create an instance of {@link AppInputs }
     */
    public AppInputs createAppInputs() {
        return new AppInputs();
    }

    /**
     * Create an instance of {@link RunAndWaitForResponse }
     */
    public RunAndWaitForResponse createRunAndWaitForResponse() {
        return new RunAndWaitForResponse();
    }

    /**
     * Create an instance of {@link RunAndWaitFor }
     */
    public RunAndWaitFor createRunAndWaitFor() {
        return new RunAndWaitFor();
    }

    /**
     * Create an instance of {@link SequenceInput }
     */
    public SequenceInput createSequenceInput() {
        return new SequenceInput();
    }

    /**
     * Create an instance of {@link GetSomeResultsRequest }
     */
    public GetSomeResultsRequest createGetSomeResultsRequest() {
        return new GetSomeResultsRequest();
    }

    /**
     * Create an instance of {@link GetStatusRequest }
     */
    public GetStatusRequest createGetStatusRequest() {
        return new GetStatusRequest();
    }

    /**
     * Create an instance of {@link TerminateRequest }
     */
    public TerminateRequest createTerminateRequest() {
        return new TerminateRequest();
    }

    /**
     * Create an instance of {@link JobStatus }
     */
    public JobStatus createJobStatus() {
        return new JobStatus();
    }

    /**
     * Create an instance of {@link GetResultsRequest }
     */
    public GetResultsRequest createGetResultsRequest() {
        return new GetResultsRequest();
    }

    /**
     * Create an instance of {@link RunResponse }
     */
    public RunResponse createRunResponse() {
        return new RunResponse();
    }

    /**
     * Create an instance of {@link GetLastEventRequest }
     */
    public GetLastEventRequest createGetLastEventRequest() {
        return new GetLastEventRequest();
    }

    /**
     * Create an instance of {@link DescribeResponse }
     */
    public DescribeResponse createDescribeResponse() {
        return new DescribeResponse();
    }

    /**
     * Create an instance of {@link GetResultsInfoResponse }
     */
    public GetResultsInfoResponse createGetResultsInfoResponse() {
        return new GetResultsInfoResponse();
    }

    /**
     * Create an instance of {@link ClearRequest }
     */
    public ClearRequest createClearRequest() {
        return new ClearRequest();
    }

    /**
     * Create an instance of {@link GetResultsInfoRequest }
     */
    public GetResultsInfoRequest createGetResultsInfoRequest() {
        return new GetResultsInfoRequest();
    }

    /**
     * Create an instance of {@link WaitforRequest }
     */
    public WaitforRequest createWaitforRequest() {
        return new WaitforRequest();
    }

    /**
     * Create an instance of {@link DescribeRequest }
     */
    public DescribeRequest createDescribeRequest() {
        return new DescribeRequest();
    }

    /**
     * Create an instance of {@link GetLastEventResponse }
     */
    public GetLastEventResponse createGetLastEventResponse() {
        return new GetLastEventResponse();
    }

    /**
     * Create an instance of {@link JobId }
     */
    public JobId createJobId() {
        return new JobId();
    }

    /**
     * Create an instance of {@link ResultInfo }
     */
    public ResultInfo createResultInfo() {
        return new ResultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "describe")
    public JAXBElement<DescribeRequest> createDescribe(DescribeRequest value) {
        return new JAXBElement<DescribeRequest>(_Describe_QNAME, DescribeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunAndWaitForResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/ilsp_nlp", name = "runAndWaitForResponse")
    public JAXBElement<RunAndWaitForResponse> createRunAndWaitForResponse(RunAndWaitForResponse value) {
        return new JAXBElement<RunAndWaitForResponse>(_RunAndWaitForResponse_QNAME, RunAndWaitForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunAndWaitFor }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/ilsp_nlp", name = "runAndWaitFor")
    public JAXBElement<RunAndWaitFor> createRunAndWaitFor(RunAndWaitFor value) {
        return new JAXBElement<RunAndWaitFor>(_RunAndWaitFor_QNAME, RunAndWaitFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitforRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "waitfor")
    public JAXBElement<WaitforRequest> createWaitfor(WaitforRequest value) {
        return new JAXBElement<WaitforRequest>(_Waitfor_QNAME, WaitforRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsInfoRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getResultsInfo")
    public JAXBElement<GetResultsInfoRequest> createGetResultsInfo(GetResultsInfoRequest value) {
        return new JAXBElement<GetResultsInfoRequest>(_GetResultsInfo_QNAME, GetResultsInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "clear")
    public JAXBElement<ClearRequest> createClear(ClearRequest value) {
        return new JAXBElement<ClearRequest>(_Clear_QNAME, ClearRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsInfoResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getResultsInfoResponse")
    public JAXBElement<GetResultsInfoResponse> createGetResultsInfoResponse(GetResultsInfoResponse value) {
        return new JAXBElement<GetResultsInfoResponse>(_GetResultsInfoResponse_QNAME, GetResultsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppResults }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/ilsp_nlp", name = "getSomeResultsResponse")
    public JAXBElement<AppResults> createGetSomeResultsResponse(AppResults value) {
        return new JAXBElement<AppResults>(_GetSomeResultsResponse_QNAME, AppResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppResults }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/ilsp_nlp", name = "getResultsResponse")
    public JAXBElement<AppResults> createGetResultsResponse(AppResults value) {
        return new JAXBElement<AppResults>(_GetResultsResponse_QNAME, AppResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEventResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getLastEventResponse")
    public JAXBElement<GetLastEventResponse> createGetLastEventResponse(GetLastEventResponse value) {
        return new JAXBElement<GetLastEventResponse>(_GetLastEventResponse_QNAME, GetLastEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInputs }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/ilsp_nlp", name = "run")
    public JAXBElement<AppInputs> createRun(AppInputs value) {
        return new JAXBElement<AppInputs>(_Run_QNAME, AppInputs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "terminate")
    public JAXBElement<TerminateRequest> createTerminate(TerminateRequest value) {
        return new JAXBElement<TerminateRequest>(_Terminate_QNAME, TerminateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getStatusResponse")
    public JAXBElement<JobStatus> createGetStatusResponse(JobStatus value) {
        return new JAXBElement<JobStatus>(_GetStatusResponse_QNAME, JobStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomeResultsRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getSomeResults")
    public JAXBElement<GetSomeResultsRequest> createGetSomeResults(GetSomeResultsRequest value) {
        return new JAXBElement<GetSomeResultsRequest>(_GetSomeResults_QNAME, GetSomeResultsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getStatus")
    public JAXBElement<GetStatusRequest> createGetStatus(GetStatusRequest value) {
        return new JAXBElement<GetStatusRequest>(_GetStatus_QNAME, GetStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "describeResponse")
    public JAXBElement<DescribeResponse> createDescribeResponse(DescribeResponse value) {
        return new JAXBElement<DescribeResponse>(_DescribeResponse_QNAME, DescribeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEventRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getLastEvent")
    public JAXBElement<GetLastEventRequest> createGetLastEvent(GetLastEventRequest value) {
        return new JAXBElement<GetLastEventRequest>(_GetLastEvent_QNAME, GetLastEventRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "runResponse")
    public JAXBElement<RunResponse> createRunResponse(RunResponse value) {
        return new JAXBElement<RunResponse>(_RunResponse_QNAME, RunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://soaplab.org/typedws", name = "getResults")
    public JAXBElement<GetResultsRequest> createGetResults(GetResultsRequest value) {
        return new JAXBElement<GetResultsRequest>(_GetResults_QNAME, GetResultsRequest.class, null, value);
    }

}

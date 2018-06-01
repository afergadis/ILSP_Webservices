from zeep import Client
import requests

# ilsp_nlp service usage
text = 'Η Αττική είναι ιστορική περιοχή της Ελλάδας που σήμερα αποτελεί μία από τις 13 περιφέρειες της χώρας.'
client = Client('http://nlp.ilsp.gr/soaplab2-axis/typed/services/getstarted.ilsp_nlp?wsdl')
output_url = client.service.runAndWaitFor(language='el',
                                          InputType='txt',
                                          OutputType='conllu',
                                          input_direct_data=text)['output_url']

r = requests.get(output_url)
print(r.text)

# ilsp_nlp_depparse_ud usage
client = Client('http://nlp.ilsp.gr/soaplab2-axis/typed/services/getstarted.ilsp_nlp_depparse_ud?wsdl')
output_url = client.service.runAndWaitFor(language='el',
                                          InputType='txt',
                                          OutputType='conll2007',
                                          input_direct_data=text)['output_url']
r = requests.get(output_url)
print(r.text)

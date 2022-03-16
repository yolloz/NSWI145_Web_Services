# Intermediary

This happens in the intermediary:
- Intermediary checks headers if there is a `<log xmlns="http://example.org/" userLogin="xxx" />` header present
- Intermediary gets user login from the SOAP header and VIN parameter from the SOAP body and logs that a request was made
- Log header is removed and the request is forwarded to the manufacturer service
- When the response arrives, intermediary checks, if there are any faults
- If there is a fault, a `<logged ns0:level="ERROR" xmlns="http://example.org/" xmlns:ns0="http://example.org/">...</logged>` header is added to the response with a description of the error.
- Otherwise, a `<logged ns0:level="INFO" xmlns="http://example.org/" xmlns:ns0="http://example.org/">OK</logged>` header is added to the response
- The response is sent to the sender


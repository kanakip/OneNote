//FIG

HTTP status codes 400 and 500 indicate that something is wrong with a web request or the server: 

• 400 Bad Request
The client's request has incorrect syntax. The client needs to correct the request and try again. 
• 500 Internal Server Error
The server encountered an unexpected condition and was unable to complete the request. Developers or administrators need to resolve the issue on the server. 

1xx - Informational Responses
100 Continue – The server received the request headers and expects the client to continue sending the request body.

101 Switching Protocols – The server is switching protocols based on the client's request.

2xx - Success
200 OK – The request was successful.

201 Created – The request led to the creation of a new resource.

204 No Content – The request was successful, but there is no content to return.

3xx - Redirection
301 Moved Permanently – The requested resource has been permanently moved to a new location.

304 Not Modified – The resource has not changed since the last request, so the cached version can be used.

4xx - Client Errors
400 Bad Request – The server could not understand the request due to malformed syntax.

401 Unauthorized – Authentication is required for the request.

403 Forbidden – Access to the resource is denied.

404 Not Found – The requested resource does not exist.

408 Request Timeout – The server did not receive the request within the expected time frame.

5xx - Server Errors
500 Internal Server Error – The server encountered an unexpected condition that prevented it from fulfilling the request.

502 Bad Gateway – The server received an invalid response from an upstream server.

503 Service Unavailable – The server is temporarily unavailable, often due to maintenance.

504 Gateway Timeout – The server did not receive a timely response from an upstream server.

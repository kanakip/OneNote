HTTP status codes indicate the result of a request made to a web server. They are grouped into five categories:

1xx - Informational
- 100 Continue – The server received the request and is processing it.
- 101 Switching Protocols – The server is switching protocols as requested.

  2xx - Success
- 200 OK – The request was successful.
- 201 Created – A new resource was successfully created.
- 204 No Content – The request was successful, but there is no response body.

3xx - Redirection
- 301 Moved Permanently – The requested resource has been permanently moved.
- 302 Found – The resource is temporarily located elsewhere.
- 304 Not Modified – The cached version of the resource is still valid.

4xx - Client Errors
- 400 Bad Request – The request is malformed or invalid.
- 401 Unauthorized – Authentication is required.
- 403 Forbidden – The request is valid but access is denied.
- 404 Not Found – The requested resource does not exist.

5xx - Server Errors
- 500 Internal Server Error – A generic error occurred on the server.
- 502 Bad Gateway – The server received an invalid response from an upstream server.
- 503 Service Unavailable – The server is temporarily unavailable.

For a more detailed breakdown, you can check [this reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Reference/Status). Would you like me to explain how these codes are used in APIs? 😊

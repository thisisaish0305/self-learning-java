package APIDesign;


/*
* API to support finding files inside a folder.
* - find files with names
* - files with give size requirements
*   Files - DB - filename fileId size dateCreated DateModified fileFormat actualFile
*
*   findFiles(dir, search input)
*
*   GET {hostname}/files?name = {}
*   List<File> files
*
*   GET {hostname}/files?size = {}
*
*   GET {hostname}/files?dateCreated <,> or = {}
*
*   GET {hostname}/files?format = pdf
*
*   Authenticating and authorization
*   Responses - 200ok, 204ok, 404 not found, 500 server error
*   pagination and sorting
*
*   using RSQL - for filtering.
*
*   Paging - per_page=10&
*   structuring the code
*   database design and filtering.
* */


public class Solution {
}



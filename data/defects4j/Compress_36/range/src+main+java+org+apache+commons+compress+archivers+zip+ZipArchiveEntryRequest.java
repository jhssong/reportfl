{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntryRequest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntryRequest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 81,
      "comment": "\n * A Thread-safe representation of a ZipArchiveEntry that is used to add entries to parallel archives.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipArchiveEntry"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     The zipArchiveEntry is not thread safe, and cannot be safely accessed by the getters of this class.\n     It is safely accessible during the construction part of this class and also after the\n     thread pools have been shut down.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "payloadSupplier"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.ZipArchiveEntryRequest(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.parallel.InputStreamSupplier)",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 47)",
        "(line 43,col 9)-(line 43,col 47)",
        "(line 44,col 9)-(line 44,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.parallel.InputStreamSupplier)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create a ZipArchiveEntryRequest\n     * @param zipArchiveEntry The entry to use\n     * @param payloadSupplier The payload that will be added to the zip entry.\n     * @return The newly created request\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.getPayloadStream()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * The paylaod that will be added to this zip entry\n     * @return The input stream.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.getMethod()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * The compression method to use\n     * @return The compression method to use\n     ",
      "child_ranges": [
        "(line 70,col 8)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.getZipArchiveEntry()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Gets the underlying entry. Do not use this methods from threads that did not create the instance itself !\n     * @return the zipeArchiveEntry that is basis for this request\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 31)"
      ]
    }
  ]
}
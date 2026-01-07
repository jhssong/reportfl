{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/archivers/zip/UnparseableExtraFieldData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnparseableExtraFieldData",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 31,
      "end_line": 113,
      "comment": "\n * Wrapper for extra field data that doesn\u0027t conform to the recommended format of header-tag + size + data.\n *\n * \u003cp\u003eThe header-id is artificial (and not listed as a known ID in \u003ca\n * href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003eAPPNOTE.TXT\u003c/a\u003e).  Since it isn\u0027t used anywhere\n * except to satisfy the ZipExtraField contract it shouldn\u0027t matter anyway.\u003c/p\u003e\n *\n * @since 1.1\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localFileData"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "centralDirectoryData"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getHeaderId()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * The Header-ID.\n     *\n     * @return a completely arbitrary value that should be ignored.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getLocalFileDataLength()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Length of the complete extra field in the local file data.\n     *\n     * @return The LocalFileDataLength value\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getCentralDirectoryLength()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Length of the complete extra field in the central directory.\n     *\n     * @return The CentralDirectoryLength value\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getLocalFileDataData()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * The actual data to put into local file data.\n     *\n     * @return The LocalFileDataData value\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getCentralDirectoryData()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * The actual data to put into central directory.\n     *\n     * @return The CentralDirectoryData value\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Populate data from this array as if it was in central directory data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 48)",
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 110,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/archivers/zip/UnparseableExtraFieldData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnparseableExtraFieldData",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 32,
      "end_line": 114,
      "comment": "\n * Wrapper for extra field data that doesn\u0027t conform to the recommended format of header-tag + size + data.\n *\n * \u003cp\u003eThe header-id is artificial (and not listed as a known ID in\n * {@link \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003e\n * APPNOTE.TXT\u003c/a\u003e}).  Since it isn\u0027t used anywhere except to satisfy the\n * ZipExtraField contract it shouldn\u0027t matter anyway.\u003c/p\u003e\n *\n * @since Apache Commons Compress 1.1\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localFileData"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "centralDirectoryData"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getHeaderId()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * The Header-ID.\n     *\n     * @return a completely arbitrary value that should be ignored.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getLocalFileDataLength()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Length of the complete extra field in the local file data.\n     *\n     * @return The LocalFileDataLength value\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getCentralDirectoryLength()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Length of the complete extra field in the central directory.\n     *\n     * @return The CentralDirectoryLength value\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getLocalFileDataData()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * The actual data to put into local file data.\n     *\n     * @return The LocalFileDataData value\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.getCentralDirectoryData()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * The actual data to put into central directory.\n     *\n     * @return The CentralDirectoryData value\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Populate data from this array as if it was in central directory data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 48)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 111,col 9)"
      ]
    }
  ]
}
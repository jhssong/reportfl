{
  "filepath": "/tmp/Compress-11b/src/main/java/org/apache/commons/compress/archivers/zip/UnrecognizedExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnrecognizedExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 29,
      "end_line": 148,
      "comment": "\n * Simple placeholder for all those extra fields we don\u0027t want to deal\n * with.\n *\n * \u003cp\u003eAssumes local file data and central directory entries are\n * identical - unless told the opposite.\u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "headerId"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * The Header-ID.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.setHeaderId(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Set the header id.\n     * @param headerId the header id to use\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getHeaderId()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Get the header id.\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Extra field data in local file data - without\n     * Header-ID or length specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.setLocalFileDataData(byte[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Set the extra field data in the local file data -\n     * without Header-ID or length specifier.\n     * @param data the field data to use\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getLocalFileDataLength()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Get the length of the local data.\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getLocalFileDataData()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get the local data.\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Extra field data in central directory - without\n     * Header-ID or length specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.setCentralDirectoryData(byte[])",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Set the extra field data in central directory.\n     * @param data the data to use\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getCentralDirectoryLength()",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n     * Get the central data length.\n     * If there is no central data, get the local file data length.\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getCentralDirectoryData()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Get the central data.\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * @param data the array of bytes.\n     * @param offset the source location in the data array.\n     * @param length the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 129,col 9)-(line 129,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\n     * @param data the array of bytes.\n     * @param offset the source location in the data array.\n     * @param length the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 145,col 9)"
      ]
    }
  ]
}
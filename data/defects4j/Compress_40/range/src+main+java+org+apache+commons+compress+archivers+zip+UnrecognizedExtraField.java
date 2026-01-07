{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/UnrecognizedExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnrecognizedExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 29,
      "end_line": 155,
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
      "end_line": 51,
      "comment": "\n     * Get the header id.\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Extra field data in local file data - without\n     * Header-ID or length specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.setLocalFileDataData(byte[])",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Set the extra field data in the local file data -\n     * without Header-ID or length specifier.\n     * @param data the field data to use\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getLocalFileDataLength()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Get the length of the local data.\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getLocalFileDataData()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Get the local data.\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Extra field data in central directory - without\n     * Header-ID or length specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.setCentralDirectoryData(byte[])",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Set the extra field data in central directory.\n     * @param data the data to use\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getCentralDirectoryLength()",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Get the central data length.\n     * If there is no central data, get the local file data length.\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.getCentralDirectoryData()",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Get the central data.\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * @param data the array of bytes.\n     * @param offset the source location in the data array.\n     * @param length the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 144,
      "end_line": 153,
      "comment": "\n     * @param data the array of bytes.\n     * @param offset the source location in the data array.\n     * @param length the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 55)",
        "(line 149,col 9)-(line 149,col 37)",
        "(line 150,col 9)-(line 152,col 9)"
      ]
    }
  ]
}
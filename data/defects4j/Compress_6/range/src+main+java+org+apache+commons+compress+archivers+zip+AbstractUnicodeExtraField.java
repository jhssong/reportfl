{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnicodeExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 29,
      "end_line": 168,
      "comment": "\n * A common base class for Unicode extra information extra fields.\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "nameCRC32"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unicodeName"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField()",
      "begin_line": 34,
      "end_line": 35,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 49,
      "end_line": 59,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the orginal zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     * @param off The offset of the encoded filename or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded filename or commentin\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 54,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField(java.lang.String, byte[])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the orginal zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.assembleData()",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 69)",
        "(line 82,col 9)-(line 82,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getNameCRC32()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @return The CRC32 checksum of the filename or comment as\n     *         encoded in the central directory of the zip file.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setNameCRC32(long)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * @param nameCRC32 The CRC32 checksum of the filename as encoded\n     *         in the central directory of the zip file to set.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getUnicodeName()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * @return The utf-8 encoded name.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setUnicodeName(byte[])",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * @param unicodeName The utf-8 encoded name to set.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryData()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryLength()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataData()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataLength()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 139,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 148,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 57)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 55)"
      ]
    }
  ]
}
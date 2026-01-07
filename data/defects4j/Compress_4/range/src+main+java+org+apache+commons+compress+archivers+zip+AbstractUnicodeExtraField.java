{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnicodeExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 29,
      "end_line": 172,
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
      "end_line": 61,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the orginal zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     * @param off The offset of the encoded filename or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded filename or commentin\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)",
        "(line 52,col 9)-(line 52,col 38)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 55,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField(java.lang.String, byte[])",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the orginal zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.assembleData()",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 48)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 69)",
        "(line 85,col 9)-(line 85,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getNameCRC32()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @return The CRC32 checksum of the filename or comment as\n     *         encoded in the central directory of the zip file.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setNameCRC32(long)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * @param nameCRC32 The CRC32 checksum of the filename as encoded\n     *         in the central directory of the zip file to set.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getUnicodeName()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * @return The utf-8 encoded name.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setUnicodeName(byte[])",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * @param unicodeName The utf-8 encoded name to set.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryData()",
      "begin_line": 120,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryLength()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataData()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataLength()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 142,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 37)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 55)"
      ]
    }
  ]
}
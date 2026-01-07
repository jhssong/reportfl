{
  "filepath": "/tmp/Compress-12b/src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnicodeExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 29,
      "end_line": 189,
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
      "end_line": 112,
      "comment": "\n     * @return The utf-8 encoded name.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setUnicodeName(byte[])",
      "begin_line": 117,
      "end_line": 126,
      "comment": "\n     * @param unicodeName The utf-8 encoded name to set.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryData()",
      "begin_line": 129,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryLength()",
      "begin_line": 142,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataData()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataLength()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 160,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 73)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 184,
      "end_line": 188,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 55)"
      ]
    }
  ]
}
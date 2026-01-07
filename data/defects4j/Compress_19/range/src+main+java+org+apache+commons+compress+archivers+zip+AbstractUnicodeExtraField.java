{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnicodeExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 31,
      "end_line": 191,
      "comment": "\n * A common base class for Unicode extra information extra fields.\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "nameCRC32"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unicodeName"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField()",
      "begin_line": 36,
      "end_line": 37,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the original zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     * @param off The offset of the encoded filename or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded filename or commentin\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)",
        "(line 53,col 9)-(line 53,col 38)",
        "(line 54,col 9)-(line 54,col 37)",
        "(line 56,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.AbstractUnicodeExtraField(java.lang.String, byte[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Assemble as unicode extension from the name/comment and\n     * encoding of the original zip entry.\n     * \n     * @param text The file name or comment.\n     * @param bytes The encoded of the filename or comment in the zip\n     * file.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.assembleData()",
      "begin_line": 75,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 48)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 69)",
        "(line 84,col 9)-(line 84,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getNameCRC32()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @return The CRC32 checksum of the filename or comment as\n     *         encoded in the central directory of the zip file.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setNameCRC32(long)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * @param nameCRC32 The CRC32 checksum of the filename as encoded\n     *         in the central directory of the zip file to set.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getUnicodeName()",
      "begin_line": 107,
      "end_line": 114,
      "comment": "\n     * @return The utf-8 encoded name.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.setUnicodeName(byte[])",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * @param unicodeName The utf-8 encoded name to set.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryData()",
      "begin_line": 131,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getCentralDirectoryLength()",
      "begin_line": 144,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataData()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.getLocalFileDataLength()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 162,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 177,col 9)-(line 177,col 43)",
        "(line 178,col 9)-(line 178,col 73)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 55)"
      ]
    }
  ]
}
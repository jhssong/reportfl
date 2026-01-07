{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/UnicodePathExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodePathExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField"
      ],
      "begin_line": 37,
      "end_line": 72,
      "comment": "\n * Info-ZIP Unicode Path Extra Field (0x7075):\n *\n * \u003cp\u003eStores the UTF-8 version of the file name field as stored in the \n * local header and central directory header.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *         Value         Size        Description\n *         -----         ----        -----------\n * (UPath) 0x7075        Short       tag for this extra block type (\"up\")\n *         TSize         Short       total data size for this block\n *         Version       1 byte      version of this extra field, currently 1\n *         NameCRC32     4 bytes     File Name Field CRC32 Checksum\n *         UnicodeName   Variable    UTF-8 version of the entry File Name\n * \u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "UPATH_ID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField()",
      "begin_line": 41,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Assemble as unicode path extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param text The file name\n     * @param bytes the bytes actually written to the archive\n     * @param off The offset of the encoded filename in \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded filename or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField(java.lang.String, byte[])",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Assemble as unicode path extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param name The file name\n     * @param bytes the bytes actually written to the archive\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.getHeaderId()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 24)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/UnicodeCommentExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeCommentExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField"
      ],
      "begin_line": 38,
      "end_line": 75,
      "comment": "\n * Info-ZIP Unicode Comment Extra Field (0x6375):\n *\n * \u003cp\u003eStores the UTF-8 version of the file comment as stored in the\n * central directory header.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *         Value         Size        Description\n *         -----         ----        -----------\n *  (UCom) 0x6375        Short       tag for this extra block type (\"uc\")\n *         TSize         Short       total data size for this block\n *         Version       1 byte      version of this extra field, currently 1\n *         ComCRC32      4 bytes     Comment Field CRC32 Checksum\n *         UnicodeCom    Variable    UTF-8 version of the entry comment\n * \u003c/pre\u003e\n * @NotThreadSafe super-class is not thread-safe\n "
    },
    {
      "type": "field",
      "varNames": [
        "UCOM_ID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField()",
      "begin_line": 42,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Assemble as unicode comment extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param text The file name\n     * @param bytes the bytes actually written to the archive\n     * @param off The offset of the encoded comment in \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded comment or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Assemble as unicode comment extension from the comment given as\n     * text as well as the bytes actually written to the archive.\n     * \n     * @param comment The file comment\n     * @param bytes the bytes actually written to the archive\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.getHeaderId()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 23)"
      ]
    }
  ]
}
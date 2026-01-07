{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/zip/UnicodeCommentExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeCommentExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField"
      ],
      "begin_line": 33,
      "end_line": 70,
      "comment": "\n * Info-ZIP Unicode Comment Extra Field (0x6375):\n *\n * \u003cp\u003eStores the UTF-8 version of the file comment as stored in the\n * central directory header.\u003c/p\u003e\n *\n * \u003cp\u003eSee {@link\n * \"http://www.pkware.com/documents/casestudies/APPNOTE.TXT PKWARE\u0027s\n * APPNOTE.TXT, section 4.6.8\"}.\u003c/p\u003e\n *\n * @NotThreadSafe super-class is not thread-safe\n "
    },
    {
      "type": "field",
      "varNames": [
        "UCOM_ID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField()",
      "begin_line": 37,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Assemble as unicode comment extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param text The file name\n     * @param bytes the bytes actually written to the archive\n     * @param off The offset of the encoded comment in \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded comment or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[])",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Assemble as unicode comment extension from the comment given as\n     * text as well as the bytes actually written to the archive.\n     * \n     * @param comment The file comment\n     * @param bytes the bytes actually written to the archive\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.getHeaderId()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 23)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/archivers/zip/UnicodeCommentExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeCommentExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField"
      ],
      "begin_line": 32,
      "end_line": 69,
      "comment": "\n * Info-ZIP Unicode Comment Extra Field (0x6375):\n *\n * \u003cp\u003eStores the UTF-8 version of the file comment as stored in the\n * central directory header.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003ePKWARE\u0027s\n * APPNOTE.TXT, section 4.6.8\u003c/a\u003e\n *\n * @NotThreadSafe super-class is not thread-safe\n "
    },
    {
      "type": "field",
      "varNames": [
        "UCOM_ID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField()",
      "begin_line": 36,
      "end_line": 37,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Assemble as unicode comment extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param text The file name\n     * @param bytes the bytes actually written to the archive\n     * @param off The offset of the encoded comment in \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded comment or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UnicodeCommentExtraField(java.lang.String, byte[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Assemble as unicode comment extension from the comment given as\n     * text as well as the bytes actually written to the archive.\n     * \n     * @param comment The file comment\n     * @param bytes the bytes actually written to the archive\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.getHeaderId()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 23)"
      ]
    }
  ]
}
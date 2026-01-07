{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/archivers/zip/UnicodePathExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodePathExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField"
      ],
      "begin_line": 32,
      "end_line": 68,
      "comment": "\n * Info-ZIP Unicode Path Extra Field (0x7075):\n *\n * \u003cp\u003eStores the UTF-8 version of the file name field as stored in the \n * local header and central directory header.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003ePKWARE\n * APPNOTE.TXT, section 4.6.9\u003c/a\u003e\n *\n * @NotThreadSafe super-class is not thread-safe\n "
    },
    {
      "type": "field",
      "varNames": [
        "UPATH_ID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField()",
      "begin_line": 36,
      "end_line": 37,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField(java.lang.String, byte[], int, int)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Assemble as unicode path extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param text The file name\n     * @param bytes the bytes actually written to the archive\n     * @param off The offset of the encoded filename in \u003ccode\u003ebytes\u003c/code\u003e.\n     * @param len The length of the encoded filename or comment in\n     * \u003ccode\u003ebytes\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UnicodePathExtraField(java.lang.String, byte[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Assemble as unicode path extension from the name given as\n     * text as well as the encoded bytes actually written to the archive.\n     * \n     * @param name The file name\n     * @param bytes the bytes actually written to the archive\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnicodePathExtraField.getHeaderId()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 24)"
      ]
    }
  ]
}
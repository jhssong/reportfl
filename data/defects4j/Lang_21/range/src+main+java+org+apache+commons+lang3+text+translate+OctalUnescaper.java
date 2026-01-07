{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/text/translate/OctalUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OctalUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 35,
      "end_line": 61,
      "comment": "\n * Translate escaped octal Strings back to their octal values.\n *\n * For example, \"\\45\" should go back to being the specific value (a %).\n *\n * Note that this currently only supports the viable range of octal for Java; namely \n * 1 to 377. This is both because parsing Java is the main use case and Integer.parseInt\n * throws an exception when values are larger than octal 377.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id: OctalUnescaper.java 967237 2010-07-23 20:08:57Z mbenson $\n "
    },
    {
      "type": "field",
      "varNames": [
        "OCTAL_MAX"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.OctalUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 42,
      "end_line": 60,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 17)"
      ]
    }
  ]
}
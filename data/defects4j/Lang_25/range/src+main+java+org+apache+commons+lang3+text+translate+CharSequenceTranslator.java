{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/text/translate/CharSequenceTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceTranslator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 133,
      "comment": "\n * An API for translating text. \n * Its core use is to escape and unescape text. Because escaping and unescaping \n * is completely contextual, the API does not present two separate signatures.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Translate a set of codepoints, represented by an int index into a CharSequence, \n     * into another set of codepoints. The number of codepoints consumed must be returned, \n     * and the only IOExceptions thrown must be from interacting with the Writer so that \n     * the top level API may reliable ignore StringWriter IOExceptions. \n     *\n     * @param input CharSequence that is being translated\n     * @param index int representing the current point of translation\n     * @param out Writer to translate the text to\n     * @return int count of codepoints consumed\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence)",
      "begin_line": 54,
      "end_line": 66,
      "comment": "\n     * Helper for non-Writer usage. \n     * @param input CharSequence to be translated\n     * @return String output of translation\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(java.lang.CharSequence, java.io.Writer)",
      "begin_line": 77,
      "end_line": 106,
      "comment": "\n     * Translate an input onto a Writer. This is intentionally final as its algorithm is \n     * tightly coupled with the abstract method of this class. \n     *\n     * @param input CharSequence that is being translated\n     * @param out Writer to translate the text to\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 68)",
        "(line 85,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.with(org.apache.commons.lang3.text.translate.CharSequenceTranslator...)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * Helper method to create a merger of this translator with another set of \n     * translators. Useful in customizing the standard functionality.\n     *\n     * @param translators CharSequenceTranslator array of translators to merge with this one\n     * @return CharSequenceTranslator merging this translator with the others\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 95)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 74)",
        "(line 119,col 9)-(line 119,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eReturns an upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e for the given\n     * character.\u003c/p\u003e\n     *\n     * @param codepoint The codepoint to convert.\n     * @return An upper case hexadecimal \u003ccode\u003eString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 74)"
      ]
    }
  ]
}
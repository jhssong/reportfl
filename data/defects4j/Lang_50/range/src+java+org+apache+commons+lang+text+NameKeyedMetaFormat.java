{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/NameKeyedMetaFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameKeyedMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 37,
      "end_line": 163,
      "comment": "\n * Basic metaFormat that requires enough configuration information to\n * parse/format other Formats for use by ExtendedMessageFormat.\n * \n * @see {@link ExtendedMessageFormat}\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRIGGER_END"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRIGGER_SUBFORMAT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 77,
      "comment": "\n     * Provides a builder with a fluent interface. Example:\n     * \u003cp\u003e\n     * \u003ccode\u003e\n     * \u003cpre\u003e\n     * NameKeyedMetaFormat nkmf \u003d new NameKeyedMetaFormat.Builder().put(\u0026quot;foo\u0026quot;,\n     *         new FooFormat()).put(\u0026quot;bar\u0026quot;, new BarFormat())\n     *         .put(\u0026quot;baz\u0026quot;, new BazFormat()).toNameKeyedMetaFormat();\n     * \u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keyedFormats"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.Builder.put(java.lang.String, java.text.Format)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n         * Add the specified format with the specified string key.\n         * \n         * @param key\n         * @param format\n         * @return\n         ",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 42)",
        "(line 66,col 13)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.Builder.toNameKeyedMetaFormat()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n         * Render the {@link NameKeyedMetaFormat} instance from this Builder.\n         * \n         * @return NameKeyedMetaFormat\n         ",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keyedFormats"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.NameKeyedMetaFormat(java.util.Map)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Create a new NameKeyedMetaFormat.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 94,
      "end_line": 118,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.lang.text.MetaFormatSupport#format(java.lang.Object,\n     *      java.lang.StringBuffer, java.text.FieldPosition)\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 40)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 126,
      "end_line": 152,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.lang.text.MetaFormatSupport#parseObject(java.lang.String,\n     *      java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NameKeyedMetaFormat.iterateKeys()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Extension point to alter the iteration order of the delegate format keys.\n     * \n     * @return Iterator.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 48)"
      ]
    }
  ]
}
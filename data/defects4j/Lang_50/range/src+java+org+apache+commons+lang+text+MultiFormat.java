{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/MultiFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 34,
      "end_line": 159,
      "comment": "\n * Format that tries a number of delegates in turn until one is successful.\n * Contrast to {@link CompositeFormat}.\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 72,
      "comment": "\n     * Provides a builder with a fluent interface. Example:\n     * \u003cp\u003e\n     * \u003ccode\u003e\n     * \u003cpre\u003e\n     * MultiFormat mf \u003d new MultiFormat.Builder().add(new FooFormat()).add(\n     *         new BarFormat()).add(new BazFormat()).toMultiFormat();\n     * \u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegates"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.Builder.add(java.text.Format)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n         * Add a delegate format.\n         * \n         * @param delegate\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 66)",
        "(line 58,col 13)-(line 58,col 36)",
        "(line 59,col 13)-(line 59,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.Builder.toMultiFormat()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n         * Render the {@link MultiFormat} instance from this Builder.\n         * \n         * @return MultiFormat\n         ",
      "child_ranges": [
        "(line 68,col 13)-(line 69,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "delegates"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.MultiFormat.MultiFormat()",
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * Create a new MultiFormat.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.MultiFormat.MultiFormat(java.text.Format[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Create a new MultiFormat.\n     * \n     * @param delegates\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer,\n     *      java.text.FieldPosition)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 108,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 117,
      "end_line": 131,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#parseObject(java.lang.String,\n     *      java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 33)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.setDelegates(java.text.Format[])",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Set the delegates.\n     * \n     * @param delegates\n     *            the Format[] delegates to set.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 141,col 63)",
        "(line 142,col 9)-(line 142,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.getDelegates()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Get the delegates.\n     * \n     * @return Format[].\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.getValidDelegates()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 157,col 22)"
      ]
    }
  ]
}
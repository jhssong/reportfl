{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/MultiFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 34,
      "end_line": 167,
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
      "comment": "\n         * Add a delegate format.\n         * \n         * @param delegate Format\n         * @return the builder\n         ",
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
      "comment": "\n     * Create a new MultiFormat.\n     * \n     * @param delegates Formats\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 99,
      "end_line": 111,
      "comment": "\n     * Format \u003ccode\u003eobj\u003c/code\u003e; append to \u003ccode\u003etoAppendTo\u003c/code\u003e.\n     * \n     * @param obj Object to format\n     * @param toAppendTo StringBuffer to append to\n     * @param pos FieldPosition\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 121,
      "end_line": 135,
      "comment": "\n     * Parse an object by trying each delegate.\n     * \n     * @param source string\n     * @param pos current parse position\n     * @return value returned from first delegate that does not encounter an\n     *         error.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.setDelegates(java.text.Format[])",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Set the delegates.\n     * \n     * @param delegates the Format[] delegates to set.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 63)",
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.getDelegates()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Get the delegates.\n     * \n     * @return Format[].\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormat.getValidDelegates()",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * Validate and return our delegates.\n     * \n     * @return delegate Formats, not null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)",
        "(line 164,col 9)-(line 164,col 68)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    }
  ]
}
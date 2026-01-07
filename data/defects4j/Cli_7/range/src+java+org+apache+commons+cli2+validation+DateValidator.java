{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/validation/DateValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 63,
      "end_line": 308,
      "comment": "\n * The \u003ccode\u003eDateValidator\u003c/code\u003e validates the argument values\n * are date or time value(s).\n *\n * The following example shows how to validate that\n * an argument value(s) is a Date of the following\n * type: d/M/yy (see {@link java.text.DateFormat}).\n *\n * \u003cpre\u003e\n * DateFormat date \u003d new SimpleDateFormat(\"d/M/yy\");\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * Argument dateFormat \u003d\n *     builder.withName(\"date\");\n *            .withValidator(new DateValidator(dateFormat));\n * \u003c/pre\u003e\n *\n * The following example shows how to validate that\n * an argument value(s) is a time of the following\n * type: HH:mm:ss (see {@link java.text.DateFormat}).\n *\n * \u003cpre\u003e\n * DateFormat timeFormat \u003d new SimpleDateFormat(\"HH:mm:ss\");\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * Argument time \u003d\n *     builder.withName(\"time\");\n *            .withValidator(new DateValidator(timeFormat));\n * \u003c/pre\u003e\n *\n * @author John Keyes\n *\n * @see java.text.DateFormat\n "
    },
    {
      "type": "field",
      "varNames": [
        "resources"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " i18n "
    },
    {
      "type": "field",
      "varNames": [
        "formats"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " an array of permitted DateFormats "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " minimum Date allowed i.e: a valid date occurs later than this date "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " maximum Date allowed i.e: a valid date occurs earlier than this date "
    },
    {
      "type": "field",
      "varNames": [
        "isLenient"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " leniant parsing "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.DateValidator.DateValidator()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Creates a Validator for the default date/time format\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.DateValidator.DateValidator(java.text.DateFormat)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Creates a Validator for the specified DateFormat.\n     *\n     * @param format\n     *            a DateFormat which dates must conform to\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.DateValidator.DateValidator(java.util.List)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Creates a Validator for the List of specified DateFormats.\n     *\n     * @param formats\n     *            a List of DateFormats which dates must conform to\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getDateInstance()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Creates a Validator for dates.\n     *\n     * @return DateValidator a Validator for dates\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getTimeInstance()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Creates a Validator for times.\n     *\n     * @return DateValidator a Validator for times\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getDateTimeInstance()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Creates a Validator for date/times\n     *\n     * @return DateValidator a Validator for date/times\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.validate(java.util.List)",
      "begin_line": 142,
      "end_line": 179,
      "comment": "\n     * Validate each String value in the specified List against this instances\n     * permitted DateFormats.\n     *\n     * If a value is valid then it\u0027s \u003ccode\u003eString\u003c/code\u003e value in the list is\n     * replaced with it\u0027s \u003ccode\u003eDate\u003c/code\u003e value.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setLenient(boolean)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\n     * Sets whether this validator uses lenient parsing.\n     *\n     * @param lenient whether this validator uses lenient parsing\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.isLenient()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns whether this validator uses lenient parsing.\n     *\n     * @return whether this validator uses lenient parsing\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getMaximum()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns the maximum date permitted.\n     *\n     * @return Date the maximum date permitted. If no maximum date has been\n     *         specified then return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setMaximum(java.util.Date)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Sets the maximum Date to the specified value.\n     *\n     * @param maximum\n     *            the maximum Date permitted\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getMinimum()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns the minimum date permitted.\n     *\n     * @return Date the minimum date permitted. If no minimum date has been\n     *         specified then return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setMinimum(java.util.Date)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Sets the minimum Date to the specified value.\n     *\n     * @param minimum\n     *            the minimum Date permitted\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.isDateLater(java.util.Date)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns whether the specified Date is later than the maximum date.\n     *\n     * @param date\n     *            the Date to evaluate\n     *\n     * @return boolean whether \u003ccode\u003edate\u003c/code\u003e is earlier than the maximum\n     *         date\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.isDateEarlier(java.util.Date)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns whether the specified Date is earlier than the minimum date.\n     *\n     * @param date\n     *            the Date to evaluate\n     *\n     * @return boolean whether \u003ccode\u003edate\u003c/code\u003e is earlier than the minimum\n     *         date\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setFormat(java.text.DateFormat)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Sets the date format permitted.\n     *\n     * @param format\n     *              the format to use\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setFormats(java.util.List)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Sets the date formats permitted.\n     *\n     * @param formats\n     *               the List of DateFormats to use\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.setFormats(java.text.DateFormat[])",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Sets the date formats permitted.\n     *\n     * @param formats\n     *               the array of DateFormats to use\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 31)",
        "(line 297,col 9)-(line 297,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.DateValidator.getFormats()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Gets the date formats permitted.\n     *\n     * @return the permitted formats\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 28)"
      ]
    }
  ]
}
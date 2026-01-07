{
  "filepath": "/tmp/Lang-13b/src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDatePrinter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DatePrinter",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1199,
      "comment": "\n * \u003cp\u003eFastDatePrinter is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement to\n * {@code SimpleDateFormat} in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * {@code SimpleDateFormat} is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones and some year patterns - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, {@code \u0027Z\u0027}, to represent\n * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern {@code \u0027ZZ\u0027} has been made to represent\n * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * \u003cp\u003eJavadoc cites for the year pattern: \u003ci\u003eFor formatting, if the number of\n * pattern letters is 2, the year is truncated to 2 digits; otherwise it is\n * interpreted as a number.\u003c/i\u003e Starting with Java 1.7 a pattern of \u0027Y\u0027 or\n * \u0027YYY\u0027 will be formatted as \u00272003\u0027, while it was \u002703\u0027 in former Java\n * versions. FastDatePrinter implements the behavior of Java 7.\u003c/p\u003e\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.FastDatePrinter(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDatePrinter.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern\n     * @param timeZone  non-null time zone to use\n     * @param locale  non-null locale to use\n     * @throws NullPointerException if pattern, timeZone, or locale is null.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 141,col 9)-(line 141,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.init()",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 63)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parsePattern()",
      "begin_line": 167,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     *\n     * @return a {@code List} of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 67)",
        "(line 169,col 9)-(line 169,col 49)",
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 56)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 176,col 56)",
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 179,col 36)",
        "(line 181,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parseToken(java.lang.String, int[])",
      "begin_line": 297,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     *\n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 48)",
        "(line 300,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 301,col 38)",
        "(line 303,col 9)-(line 303,col 35)",
        "(line 304,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 345,col 24)",
        "(line 346,col 9)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule(int, int)",
      "begin_line": 356,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     *\n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 378,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     *\n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long)",
      "begin_line": 394,
      "end_line": 396,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long)\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date)",
      "begin_line": 401,
      "end_line": 405,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 63)",
        "(line 403,col 9)-(line 403,col 24)",
        "(line 404,col 9)-(line 404,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar)",
      "begin_line": 410,
      "end_line": 412,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long, java.lang.StringBuffer)",
      "begin_line": 417,
      "end_line": 419,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 424,
      "end_line": 428,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 63)",
        "(line 426,col 9)-(line 426,col 24)",
        "(line 427,col 9)-(line 427,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 433,
      "end_line": 435,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 445,
      "end_line": 450,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getPattern()",
      "begin_line": 457,
      "end_line": 459,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZone()",
      "begin_line": 464,
      "end_line": 466,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getLocale()",
      "begin_line": 471,
      "end_line": 473,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getMaxLengthEstimate()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     *\n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.equals(java.lang.Object)",
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return {@code true} if equal\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 54)",
        "(line 502,col 9)-(line 504,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.hashCode()",
      "begin_line": 512,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.toString()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.readObject(java.io.ObjectInputStream)",
      "begin_line": 537,
      "end_line": 540,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 31)",
        "(line 539,col 9)-(line 539,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 547,
      "end_line": 562,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.estimateLength()",
      "begin_line": 553,
      "end_line": 553,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         *\n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 561,
      "end_line": 561,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 567,
      "end_line": 575,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 574,
      "end_line": 574,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 580,
      "end_line": 606,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 581,
      "end_line": 581,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n         * Constructs a new instance of {@code CharacterLiteral}\n         * to hold the specified value.\n         *\n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 590,col 13)-(line 590,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.estimateLength()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 597,col 13)-(line 597,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 604,col 13)-(line 604,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 611,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n         * Constructs a new instance of {@code StringLiteral}\n         * to hold the specified value.\n         *\n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.estimateLength()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 642,
      "end_line": 678,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 643,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.TextField(int, java.lang.String[])",
      "begin_line": 653,
      "end_line": 656,
      "comment": "\n         * Constructs an instance of {@code TextField}\n         * with the specified field and values.\n         *\n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 27)",
        "(line 655,col 13)-(line 655,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.estimateLength()",
      "begin_line": 661,
      "end_line": 670,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 24)",
        "(line 663,col 13)-(line 668,col 13)",
        "(line 669,col 13)-(line 669,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 683,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 684,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 691,
      "end_line": 693,
      "comment": "\n         * Constructs an instance of {@code UnpadedNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 692,col 13)-(line 692,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.estimateLength()",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 699,col 13)-(line 699,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 712,
      "end_line": 721,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 713,col 13)-(line 720,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 727,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 728,
      "end_line": 728,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n         * Constructs an instance of {@code UnpaddedMonthField}.\n         *\n         ",
      "child_ranges": [
        "(line 735,col 13)-(line 735,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.estimateLength()",
      "begin_line": 741,
      "end_line": 743,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 755,
      "end_line": 762,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 756,col 13)-(line 761,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 768,
      "end_line": 825,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 770,
      "end_line": 770,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 778,
      "end_line": 785,
      "comment": "\n         * Constructs an instance of {@code PaddedNumberField}.\n         *\n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 779,col 13)-(line 782,col 13)",
        "(line 783,col 13)-(line 783,col 27)",
        "(line 784,col 13)-(line 784,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.estimateLength()",
      "begin_line": 790,
      "end_line": 792,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 791,col 13)-(line 791,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 798,col 13)-(line 798,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 804,
      "end_line": 824,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 805,col 13)-(line 823,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 830,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 831,
      "end_line": 831,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\n         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 839,col 13)-(line 839,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.estimateLength()",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 846,col 13)-(line 846,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 852,
      "end_line": 854,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 853,col 13)-(line 853,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 859,
      "end_line": 866,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 860,col 13)-(line 865,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 872,
      "end_line": 903,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\n         * Constructs an instance of {@code TwoDigitYearField}.\n         ",
      "child_ranges": [
        "(line 879,col 13)-(line 879,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.estimateLength()",
      "begin_line": 885,
      "end_line": 887,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 886,col 13)-(line 886,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 893,col 13)-(line 893,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 900,col 13)-(line 900,col 52)",
        "(line 901,col 13)-(line 901,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 908,
      "end_line": 939,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 909,
      "end_line": 909,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n         * Constructs an instance of {@code TwoDigitMonthField}.\n         ",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.estimateLength()",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 929,col 13)-(line 929,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 935,
      "end_line": 938,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 936,col 13)-(line 936,col 52)",
        "(line 937,col 13)-(line 937,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 944,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 945,
      "end_line": 945,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\n         * Constructs an instance of {@code TwelveHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 954,col 13)-(line 954,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.estimateLength()",
      "begin_line": 960,
      "end_line": 962,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 961,col 13)-(line 961,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 967,
      "end_line": 973,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 968,col 13)-(line 968,col 52)",
        "(line 969,col 13)-(line 971,col 13)",
        "(line 972,col 13)-(line 972,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 978,
      "end_line": 980,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 986,
      "end_line": 1023,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\n         * Constructs an instance of {@code TwentyFourHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.estimateLength()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1003,col 13)-(line 1003,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1009,
      "end_line": 1015,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1010,col 13)-(line 1010,col 59)",
        "(line 1011,col 13)-(line 1013,col 13)",
        "(line 1014,col 13)-(line 1014,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1020,
      "end_line": 1022,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1021,col 13)-(line 1021,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 1027,
      "end_line": 1028,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1038,
      "end_line": 1050,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     *\n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 85)",
        "(line 1040,col 9)-(line 1040,col 54)",
        "(line 1041,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1055,
      "end_line": 1091,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1057,
      "end_line": 1057,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1058,
      "end_line": 1058,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, java.util.Locale, int)",
      "begin_line": 1067,
      "end_line": 1072,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1068,col 13)-(line 1068,col 33)",
        "(line 1070,col 13)-(line 1070,col 75)",
        "(line 1071,col 13)-(line 1071,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.estimateLength()",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1078,col 13)-(line 1078,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1084,
      "end_line": 1090,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1085,col 13)-(line 1089,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1097,
      "end_line": 1144,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number {@code +/-HHMM}\n     * or {@code +/-HH:MM}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1098,
      "end_line": 1098,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1099,
      "end_line": 1099,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1101,
      "end_line": 1101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.\n         *\n         * @param colon add colon between HH and MM in the output if {@code true}\n         ",
      "child_ranges": [
        "(line 1109,col 13)-(line 1109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1115,
      "end_line": 1117,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1116,col 13)-(line 1116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1122,
      "end_line": 1143,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1123,col 13)-(line 1123,col 96)",
        "(line 1125,col 13)-(line 1130,col 13)",
        "(line 1132,col 13)-(line 1132,col 50)",
        "(line 1133,col 13)-(line 1133,col 52)",
        "(line 1134,col 13)-(line 1134,col 52)",
        "(line 1136,col 13)-(line 1138,col 13)",
        "(line 1140,col 13)-(line 1140,col 60)",
        "(line 1141,col 13)-(line 1141,col 54)",
        "(line 1142,col 13)-(line 1142,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1150,
      "end_line": 1198,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1151,
      "end_line": 1151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1152,
      "end_line": 1152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1163,
      "end_line": 1171,
      "comment": "\n         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if {@code true}\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1165,col 13)-(line 1165,col 33)",
        "(line 1166,col 13)-(line 1168,col 13)",
        "(line 1169,col 13)-(line 1169,col 27)",
        "(line 1170,col 13)-(line 1170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1176,
      "end_line": 1179,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1178,col 13)-(line 1178,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1184,
      "end_line": 1197,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1186,col 13)-(line 1188,col 13)",
        "(line 1189,col 13)-(line 1195,col 13)",
        "(line 1196,col 13)-(line 1196,col 25)"
      ]
    }
  ]
}
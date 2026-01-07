{
  "filepath": "/tmp/Cli-26b/src/java/org/apache/commons/cli/Option.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Option",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 674,
      "comment": " \u003cp\u003eDescribes a single command-line option.  It maintains\n * information regarding the short-name of the option, the long-name,\n * if any exists, a flag indicating if an argument is required for\n * this option, and a self-documenting description of the option.\u003c/p\u003e\n *\n * \u003cp\u003eAn Option is not created independantly, but is create through\n * an instance of {@link Options}.\u003cp\u003e\n *\n * @see org.apache.commons.cli.Options\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " constant that specifies the number of argument values has not been specified "
    },
    {
      "type": "field",
      "varNames": [
        "UNLIMITED_VALUES"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " constant that specifies the number of argument values is infinite "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " the number of argument values this option can have "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " the type of this Option "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " the list of argument values *"
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " the character that is the value separator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, boolean, java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 119,
      "end_line": 135,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param longOpt the long representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 44)",
        "(line 125,col 9)-(line 125,col 23)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getId()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Returns the id of this Option.  This is only set when the\n     * Option shortOpt is a single character.  This is used for switch\n     * statements.\n     *\n     * @return the id of this Option\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getKey()",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * Returns the \u0027unique\u0027 Option identifier.\n     * \n     * @return the \u0027unique\u0027 Option identifier\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getOpt()",
      "begin_line": 175,
      "end_line": 178,
      "comment": " \n     * Retrieve the name of this Option.\n     *\n     * It is this String which can be used with\n     * {@link CommandLine#hasOption(String opt)} and\n     * {@link CommandLine#getOptionValue(String opt)} to check\n     * for existence and argument.\n     *\n     * @return The name of this option\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getType()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Retrieve the type of this Option.\n     * \n     * @return The type of this option\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Object)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Sets the type of this Option.\n     *\n     * @param type the type of this Option\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getLongOpt()",
      "begin_line": 205,
      "end_line": 208,
      "comment": " \n     * Retrieve the long name of this Option.\n     *\n     * @return Long name of this option, or null, if there is no long name\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setLongOpt(java.lang.String)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Sets the long name of this Option.\n     *\n     * @param longOpt the long name of this Option\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setOptionalArg(boolean)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Sets whether this Option can have an optional argument.\n     *\n     * @param optionalArg specifies whether the Option can have\n     * an optional argument.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasOptionalArg()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * @return whether this Option can have an optional argument\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasLongOpt()",
      "begin_line": 244,
      "end_line": 247,
      "comment": " \n     * Query to see if this Option has a long name\n     *\n     * @return boolean flag indicating existence of a long name\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArg()",
      "begin_line": 254,
      "end_line": 257,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getDescription()",
      "begin_line": 264,
      "end_line": 267,
      "comment": " \n     * Retrieve the self-documenting description of this Option\n     *\n     * @return The string description of this option\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setDescription(java.lang.String)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Sets the self-documenting description of this Option\n     *\n     * @param description The description of this option\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.isRequired()",
      "begin_line": 285,
      "end_line": 288,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setRequired(boolean)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Sets whether this Option is mandatory.\n     *\n     * @param required specifies whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgName(java.lang.String)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Sets the display name for the argument value.\n     *\n     * @param argName the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgName()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Gets the display name for the argument value.\n     *\n     * @return the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgName()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * Returns whether the display name for the argument value\n     * has been set.\n     *\n     * @return if the display name for the argument value has been\n     * set.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgs()",
      "begin_line": 337,
      "end_line": 340,
      "comment": " \n     * Query to see if this Option can take many values.\n     *\n     * @return boolean flag indicating if multiple values are allowed\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgs(int)",
      "begin_line": 347,
      "end_line": 350,
      "comment": " \n     * Sets the number of argument values this Option can take.\n     *\n     * @param num the number of argument values\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setValueSeparator(char)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\n     * Sets the value separator.  For example if the argument value\n     * was a Java property, the value separator would be \u0027\u003d\u0027.\n     *\n     * @param sep The value separator.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValueSeparator()",
      "begin_line": 368,
      "end_line": 371,
      "comment": "\n     * Returns the value separator character.\n     *\n     * @return the value separator character.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasValueSeparator()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * Return whether this Option has specified a value separator.\n     * \n     * @return whether this Option has specified a value separator.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgs()",
      "begin_line": 389,
      "end_line": 392,
      "comment": " \n     * Returns the number of argument values this Option can take.\n     *\n     * @return num the number of argument values\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValueForProcessing(java.lang.String)",
      "begin_line": 399,
      "end_line": 409,
      "comment": "\n     * Adds the specified value to this Option.\n     * \n     * @param value is a/the value of this Option\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.processValue(java.lang.String)",
      "begin_line": 422,
      "end_line": 455,
      "comment": "\n     * Processes the value.  If this Option has a value separator\n     * the value will have to be parsed into individual tokens.  When\n     * n-1 tokens have been processed and there are more value separators\n     * in the value, parsing is ceased and the remaining characters are\n     * added as a single token.\n     *\n     * @param value The String to be processed.\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 451,col 9)",
        "(line 454,col 9)-(line 454,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.add(java.lang.String)",
      "begin_line": 466,
      "end_line": 475,
      "comment": "\n     * Add the value to this Option.  If the number of arguments\n     * is greater than zero and there is enough space in the list then\n     * add the value.  Otherwise, throw a runtime exception.\n     *\n     * @param value The value to be added to this Option\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 471,col 9)",
        "(line 474,col 9)-(line 474,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue()",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @return the value/first value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(int)",
      "begin_line": 501,
      "end_line": 504,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @param index The index of the value to be returned.\n     *\n     * @return the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @throws IndexOutOfBoundsException if index is less than 1\n     * or greater than the number of the values for this Option.\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(java.lang.String)",
      "begin_line": 516,
      "end_line": 521,
      "comment": "\n     * Returns the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there is no value.\n     *\n     * @param defaultValue The value to be returned if ther\n     * is no value.\n     *\n     * @return the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there are no values.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 34)",
        "(line 520,col 9)-(line 520,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValues()",
      "begin_line": 530,
      "end_line": 533,
      "comment": "\n     * Return the values of this Option as a String array \n     * or null if there are no values\n     *\n     * @return the values of this Option as a String array \n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValuesList()",
      "begin_line": 539,
      "end_line": 542,
      "comment": "\n     * @return the values of this Option as a List\n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.toString()",
      "begin_line": 549,
      "end_line": 581,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 67)",
        "(line 553,col 9)-(line 553,col 24)",
        "(line 555,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 24)",
        "(line 562,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 47)",
        "(line 573,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 578,col 25)",
        "(line 580,col 9)-(line 580,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasNoValues()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "\n     * Returns whether this Option has any values.\n     *\n     * @return whether this Option has any values.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.equals(java.lang.Object)",
      "begin_line": 593,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 35)",
        "(line 607,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hashCode()",
      "begin_line": 619,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 19)",
        "(line 622,col 9)-(line 622,col 52)",
        "(line 623,col 9)-(line 623,col 74)",
        "(line 624,col 9)-(line 624,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clone()",
      "begin_line": 637,
      "end_line": 649,
      "comment": "\n     * A rather odd clone method - due to incorrect code in 1.0 it is public \n     * and in 1.1 rather than throwing a CloneNotSupportedException it throws \n     * a RuntimeException so as to maintain backwards compat at the API level. \n     *\n     * After calling this method, it is very likely you will want to call \n     * clearValues(). \n     *\n     * @throws RuntimeException\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clearValues()",
      "begin_line": 657,
      "end_line": 660,
      "comment": "\n     * Clear the Option values. After a parse is complete, these are left with\n     * data in them and they need clearing if another parse is done.\n     *\n     * See: \u003ca href\u003d\"https://issues.apache.org/jira/browse/CLI-71\"\u003eCLI-71\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValue(java.lang.String)",
      "begin_line": 668,
      "end_line": 672,
      "comment": "\n     * This method is not intended to be used. It was a piece of internal \n     * API that was made public in 1.0. It currently throws an UnsupportedOperationException. \n     * @deprecated\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 671,col 86)"
      ]
    }
  ]
}
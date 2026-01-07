{
  "filepath": "/tmp/Cli-17b/src/java/org/apache/commons/cli/Option.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Option",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 682,
      "comment": " \u003cp\u003eDescribes a single command-line option.  It maintains\n * information regarding the short-name of the option, the long-name,\n * if any exists, a flag indicating if an argument is required for\n * this option, and a self-documenting description of the option.\u003c/p\u003e\n *\n * \u003cp\u003eAn Option is not created independantly, but is create through\n * an instance of {@link Options}.\u003cp\u003e\n *\n * @see org.apache.commons.cli.Options\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " constant that specifies the number of argument values has \n        not been specified "
    },
    {
      "type": "field",
      "varNames": [
        "UNLIMITED_VALUES"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " constant that specifies the number of argument values is infinite "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " opt the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " longOpt is the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " argName specifies the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " required specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " \n     * numberOfArgs specifies the number of argument values this option \n     * can have \n     "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " the type of this Option "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " the list of argument values *"
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " the character that is the value separator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, boolean, java.lang.String)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 123,
      "end_line": 140,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param longOpt the long representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 44)",
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getId()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * Returns the id of this Option.  This is only set when the\n     * Option shortOpt is a single character.  This is used for switch\n     * statements.\n     *\n     * @return the id of this Option\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getKey()",
      "begin_line": 159,
      "end_line": 168,
      "comment": "\n     * Returns the \u0027unique\u0027 Option identifier.\n     * \n     * @return the \u0027unique\u0027 Option identifier\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getOpt()",
      "begin_line": 180,
      "end_line": 183,
      "comment": " \n     * Retrieve the name of this Option.\n     *\n     * It is this String which can be used with\n     * {@link CommandLine#hasOption(String opt)} and\n     * {@link CommandLine#getOptionValue(String opt)} to check\n     * for existence and argument.\n     *\n     * @return The name of this option\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getType()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Retrieve the type of this Option.\n     * \n     * @return The type of this option\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Object)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Sets the type of this Option.\n     *\n     * @param type the type of this Option\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getLongOpt()",
      "begin_line": 210,
      "end_line": 213,
      "comment": " \n     * Retrieve the long name of this Option.\n     *\n     * @return Long name of this option, or null, if there is no long name\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setLongOpt(java.lang.String)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Sets the long name of this Option.\n     *\n     * @param longOpt the long name of this Option\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setOptionalArg(boolean)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * Sets whether this Option can have an optional argument.\n     *\n     * @param optionalArg specifies whether the Option can have\n     * an optional argument.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasOptionalArg()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * @return whether this Option can have an optional argument\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasLongOpt()",
      "begin_line": 249,
      "end_line": 252,
      "comment": " \n     * Query to see if this Option has a long name\n     *\n     * @return boolean flag indicating existence of a long name\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArg()",
      "begin_line": 259,
      "end_line": 262,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getDescription()",
      "begin_line": 269,
      "end_line": 272,
      "comment": " \n     * Retrieve the self-documenting description of this Option\n     *\n     * @return The string description of this option\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setDescription(java.lang.String)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Sets the self-documenting description of this Option\n     *\n     * @param description The description of this option\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.isRequired()",
      "begin_line": 290,
      "end_line": 293,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setRequired(boolean)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Sets whether this Option is mandatory.\n     *\n     * @param required specifies whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgName(java.lang.String)",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * Sets the display name for the argument value.\n     *\n     * @param argName the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgName()",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\n     * Gets the display name for the argument value.\n     *\n     * @return the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgName()",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n     * Returns whether the display name for the argument value\n     * has been set.\n     *\n     * @return if the display name for the argument value has been\n     * set.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgs()",
      "begin_line": 342,
      "end_line": 346,
      "comment": " \n     * Query to see if this Option can take many values.\n     *\n     * @return boolean flag indicating if multiple values are allowed\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 345,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgs(int)",
      "begin_line": 353,
      "end_line": 356,
      "comment": " \n     * Sets the number of argument values this Option can take.\n     *\n     * @param num the number of argument values\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setValueSeparator(char)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * Sets the value separator.  For example if the argument value\n     * was a Java property, the value separator would be \u0027\u003d\u0027.\n     *\n     * @param sep The value separator.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValueSeparator()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\n     * Returns the value separator character.\n     *\n     * @return the value separator character.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasValueSeparator()",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * Return whether this Option has specified a value separator.\n     * \n     * @return whether this Option has specified a value separator.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgs()",
      "begin_line": 395,
      "end_line": 398,
      "comment": " \n     * Returns the number of argument values this Option can take.\n     *\n     * @return num the number of argument values\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValueForProcessing(java.lang.String)",
      "begin_line": 405,
      "end_line": 415,
      "comment": "\n     * Adds the specified value to this Option.\n     * \n     * @param value is a/the value of this Option\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.processValue(java.lang.String)",
      "begin_line": 428,
      "end_line": 465,
      "comment": "\n     * Processes the value.  If this Option has a value separator\n     * the value will have to be parsed into individual tokens.  When\n     * n-1 tokens have been processed and there are more value separators\n     * in the value, parsing is ceased and the remaining characters are\n     * added as a single token.\n     *\n     * @param value The String to be processed.\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 460,col 9)",
        "(line 464,col 9)-(line 464,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.add(java.lang.String)",
      "begin_line": 476,
      "end_line": 486,
      "comment": "\n     * Add the value to this Option.  If the number of arguments\n     * is greater than zero and there is enough space in the list then\n     * add the value.  Otherwise, throw a runtime exception.\n     *\n     * @param value The value to be added to this Option\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 481,col 9)",
        "(line 485,col 9)-(line 485,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue()",
      "begin_line": 495,
      "end_line": 498,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @return the value/first value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(int)",
      "begin_line": 512,
      "end_line": 516,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @param index The index of the value to be returned.\n     *\n     * @return the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @throws IndexOutOfBoundsException if index is less than 1\n     * or greater than the number of the values for this Option.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(java.lang.String)",
      "begin_line": 528,
      "end_line": 533,
      "comment": "\n     * Returns the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there is no value.\n     *\n     * @param defaultValue The value to be returned if ther\n     * is no value.\n     *\n     * @return the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there are no values.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 34)",
        "(line 532,col 9)-(line 532,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValues()",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\n     * Return the values of this Option as a String array \n     * or null if there are no values\n     *\n     * @return the values of this Option as a String array \n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 545,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValuesList()",
      "begin_line": 552,
      "end_line": 555,
      "comment": "\n     * @return the values of this Option as a List\n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.toString()",
      "begin_line": 562,
      "end_line": 592,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 67)",
        "(line 566,col 9)-(line 566,col 29)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 24)",
        "(line 575,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 582,col 52)",
        "(line 584,col 9)-(line 587,col 9)",
        "(line 589,col 9)-(line 589,col 25)",
        "(line 591,col 9)-(line 591,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasNoValues()",
      "begin_line": 599,
      "end_line": 602,
      "comment": "\n     * Returns whether this Option has any values.\n     *\n     * @return whether this Option has any values.\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.equals(java.lang.Object)",
      "begin_line": 604,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 606,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 35)",
        "(line 618,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hashCode()",
      "begin_line": 630,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 19)",
        "(line 633,col 9)-(line 633,col 54)",
        "(line 634,col 9)-(line 634,col 76)",
        "(line 635,col 9)-(line 635,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clone()",
      "begin_line": 648,
      "end_line": 656,
      "comment": "\n     * A rather odd clone method - due to incorrect code in 1.0 it is public \n     * and in 1.1 rather than throwing a CloneNotSupportedException it throws \n     * a RuntimeException so as to maintain backwards compat at the API level. \n     *\n     * After calling this method, it is very likely you will want to call \n     * clearValues(). \n     *\n     * @throws RuntimeException\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clearValues()",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n     * \u003cp\u003eClear the Option values. After a \n     * parse is complete, these are left with data in them \n     * and they need clearing if another parse is done. \u003c/p\u003e\n     *\n     * See: \u003ca href\u003d\"https://issues.apache.org/jira/browse/CLI-71\"\u003eCLI-71\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValue(java.lang.String)",
      "begin_line": 675,
      "end_line": 680,
      "comment": "\n     * This method is not intended to be used. It was a piece of internal \n     * API that was made public in 1.0. It currently throws an UnsupportedOperationException. \n     * @deprecated\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 679,col 13)"
      ]
    }
  ]
}
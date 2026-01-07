{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/Option.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Option",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 1012,
      "comment": "\n * Describes a single command-line option.  It maintains\n * information regarding the short-name of the option, the long-name,\n * if any exists, a flag indicating if an argument is required for\n * this option, and a self-documenting description of the option.\n * \u003cp\u003e\n * An Option is not created independently, but is created through\n * an instance of {@link Options}. An Option is required to have\n * at least a short or a long-name.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e once an {@link Option} has been added to an instance\n * of {@link Options}, it\u0027s required flag may not be changed anymore.\n *\n * @see org.apache.commons.cli.Options\n * @see org.apache.commons.cli.CommandLine\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " constant that specifies the number of argument values has not been specified "
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
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " the number of argument values this option can have "
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
      "signature": "org.apache.commons.cli.Option.Option(org.apache.commons.cli.Option.Builder)",
      "begin_line": 86,
      "end_line": 97,
      "comment": "\n     * Private constructor used by the nested Builder class.\n     * \n     * @param builder builder used to create this option\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 90,col 39)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 31)",
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 96,col 9)-(line 96,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Creates an Option using the specified parameters.\n     * The option does not take an argument.\n     *\n     * @param opt short representation of the option\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, boolean, java.lang.String)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 140,
      "end_line": 156,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param longOpt the long representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 44)",
        "(line 146,col 9)-(line 146,col 23)",
        "(line 147,col 9)-(line 147,col 31)",
        "(line 150,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getId()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Returns the id of this Option.  This is only set when the\n     * Option shortOpt is a single character.  This is used for switch\n     * statements.\n     *\n     * @return the id of this Option\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getKey()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Returns the \u0027unique\u0027 Option identifier.\n     * \n     * @return the \u0027unique\u0027 Option identifier\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getOpt()",
      "begin_line": 191,
      "end_line": 194,
      "comment": " \n     * Retrieve the name of this Option.\n     *\n     * It is this String which can be used with\n     * {@link CommandLine#hasOption(String opt)} and\n     * {@link CommandLine#getOptionValue(String opt)} to check\n     * for existence and argument.\n     *\n     * @return The name of this option\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getType()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Retrieve the type of this Option.\n     * \n     * @return The type of this option\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Object)",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * Sets the type of this Option.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this method is kept for binary compatibility and the\n     * input type is supposed to be a {@link Class} object. \n     *\n     * @param type the type of this Option\n     * @deprecated since 1.3, use {@link #setType(Class)} instead\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Class\u003c?\u003e)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Sets the type of this Option.\n     *\n     * @param type the type of this Option\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getLongOpt()",
      "begin_line": 237,
      "end_line": 240,
      "comment": " \n     * Retrieve the long name of this Option.\n     *\n     * @return Long name of this option, or null, if there is no long name\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setLongOpt(java.lang.String)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Sets the long name of this Option.\n     *\n     * @param longOpt the long name of this Option\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setOptionalArg(boolean)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Sets whether this Option can have an optional argument.\n     *\n     * @param optionalArg specifies whether the Option can have\n     * an optional argument.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasOptionalArg()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * @return whether this Option can have an optional argument\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasLongOpt()",
      "begin_line": 276,
      "end_line": 279,
      "comment": " \n     * Query to see if this Option has a long name\n     *\n     * @return boolean flag indicating existence of a long name\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArg()",
      "begin_line": 286,
      "end_line": 289,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getDescription()",
      "begin_line": 296,
      "end_line": 299,
      "comment": " \n     * Retrieve the self-documenting description of this Option\n     *\n     * @return The string description of this option\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setDescription(java.lang.String)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * Sets the self-documenting description of this Option\n     *\n     * @param description The description of this option\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.isRequired()",
      "begin_line": 317,
      "end_line": 320,
      "comment": " \n     * Query to see if this Option is mandatory\n     *\n     * @return boolean flag indicating whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setRequired(boolean)",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * Sets whether this Option is mandatory.\n     *\n     * @param required specifies whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgName(java.lang.String)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Sets the display name for the argument value.\n     *\n     * @param argName the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgName()",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * Gets the display name for the argument value.\n     *\n     * @return the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgName()",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n     * Returns whether the display name for the argument value has been set.\n     *\n     * @return if the display name for the argument value has been set.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgs()",
      "begin_line": 367,
      "end_line": 370,
      "comment": " \n     * Query to see if this Option can take many values.\n     *\n     * @return boolean flag indicating if multiple values are allowed\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgs(int)",
      "begin_line": 377,
      "end_line": 380,
      "comment": " \n     * Sets the number of argument values this Option can take.\n     *\n     * @param num the number of argument values\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setValueSeparator(char)",
      "begin_line": 388,
      "end_line": 391,
      "comment": "\n     * Sets the value separator.  For example if the argument value\n     * was a Java property, the value separator would be \u0027\u003d\u0027.\n     *\n     * @param sep The value separator.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValueSeparator()",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Returns the value separator character.\n     *\n     * @return the value separator character.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasValueSeparator()",
      "begin_line": 409,
      "end_line": 412,
      "comment": "\n     * Return whether this Option has specified a value separator.\n     * \n     * @return whether this Option has specified a value separator.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgs()",
      "begin_line": 428,
      "end_line": 431,
      "comment": " \n     * Returns the number of argument values this Option can take.\n     * \n     * \u003cp\u003e\n     * A value equal to the constant {@link #UNINITIALIZED} (\u003d -1) indicates\n     * the number of arguments has not been specified.\n     * A value equal to the constant {@link #UNLIMITED_VALUES} (\u003d -2) indicates\n     * that this options takes an unlimited amount of values.\n     * \u003c/p\u003e\n     *\n     * @return num the number of argument values\n     * @see #UNINITIALIZED\n     * @see #UNLIMITED_VALUES\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValueForProcessing(java.lang.String)",
      "begin_line": 438,
      "end_line": 445,
      "comment": "\n     * Adds the specified value to this Option.\n     * \n     * @param value is a/the value of this Option\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.processValue(java.lang.String)",
      "begin_line": 458,
      "end_line": 491,
      "comment": "\n     * Processes the value.  If this Option has a value separator\n     * the value will have to be parsed into individual tokens.  When\n     * n-1 tokens have been processed and there are more value separators\n     * in the value, parsing is ceased and the remaining characters are\n     * added as a single token.\n     *\n     * @param value The String to be processed.\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 487,col 9)",
        "(line 490,col 9)-(line 490,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.add(java.lang.String)",
      "begin_line": 502,
      "end_line": 511,
      "comment": "\n     * Add the value to this Option.  If the number of arguments\n     * is greater than zero and there is enough space in the list then\n     * add the value.  Otherwise, throw a runtime exception.\n     *\n     * @param value The value to be added to this Option\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 507,col 9)",
        "(line 510,col 9)-(line 510,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @return the value/first value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(int)",
      "begin_line": 537,
      "end_line": 540,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @param index The index of the value to be returned.\n     *\n     * @return the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @throws IndexOutOfBoundsException if index is less than 1\n     * or greater than the number of the values for this Option.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(java.lang.String)",
      "begin_line": 552,
      "end_line": 557,
      "comment": "\n     * Returns the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there is no value.\n     *\n     * @param defaultValue The value to be returned if there\n     * is no value.\n     *\n     * @return the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there are no values.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 40)",
        "(line 556,col 9)-(line 556,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValues()",
      "begin_line": 566,
      "end_line": 569,
      "comment": "\n     * Return the values of this Option as a String array \n     * or null if there are no values\n     *\n     * @return the values of this Option as a String array \n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValuesList()",
      "begin_line": 575,
      "end_line": 578,
      "comment": "\n     * @return the values of this Option as a List\n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.toString()",
      "begin_line": 585,
      "end_line": 618,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 75)",
        "(line 590,col 9)-(line 590,col 24)",
        "(line 592,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 24)",
        "(line 599,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 47)",
        "(line 610,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 25)",
        "(line 617,col 9)-(line 617,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasNoValues()",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\n     * Returns whether this Option has any values.\n     *\n     * @return whether this Option has any values.\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.equals(java.lang.Object)",
      "begin_line": 630,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 41)",
        "(line 644,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hashCode()",
      "begin_line": 656,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 19)",
        "(line 660,col 9)-(line 660,col 50)",
        "(line 661,col 9)-(line 661,col 74)",
        "(line 662,col 9)-(line 662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clone()",
      "begin_line": 677,
      "end_line": 690,
      "comment": "\n     * A rather odd clone method - due to incorrect code in 1.0 it is public \n     * and in 1.1 rather than throwing a CloneNotSupportedException it throws \n     * a RuntimeException so as to maintain backwards compat at the API level. \n     *\n     * After calling this method, it is very likely you will want to call \n     * clearValues(). \n     *\n     * @return a clone of this Option instance\n     * @throws RuntimeException if a {@link CloneNotSupportedException} has been thrown\n     * by {@code super.clone()}\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 689,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clearValues()",
      "begin_line": 698,
      "end_line": 701,
      "comment": "\n     * Clear the Option values. After a parse is complete, these are left with\n     * data in them and they need clearing if another parse is done.\n     *\n     * See: \u003ca href\u003d\"https://issues.apache.org/jira/browse/CLI-71\"\u003eCLI-71\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValue(java.lang.String)",
      "begin_line": 712,
      "end_line": 717,
      "comment": "\n     * This method is not intended to be used. It was a piece of internal \n     * API that was made public in 1.0. It currently throws an UnsupportedOperationException.\n     *\n     * @param value the value to add\n     * @return always throws an {@link UnsupportedOperationException}\n     * @throws UnsupportedOperationException always\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 716,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.acceptsArg()",
      "begin_line": 725,
      "end_line": 728,
      "comment": "\n     * Tells if the option can accept more arguments.\n     * \n     * @return false if the maximum number of arguments is reached\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.requiresArg()",
      "begin_line": 736,
      "end_line": 747,
      "comment": "\n     * Tells if the option requires more arguments to be valid.\n     * \n     * @return false if the option doesn\u0027t require more arguments\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 746,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.builder()",
      "begin_line": 756,
      "end_line": 759,
      "comment": "\n     * Returns a {@link Builder} to create an {@link Option} using descriptive\n     * methods.  \n     * \n     * @return a new {@link Builder} instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.builder(java.lang.String)",
      "begin_line": 770,
      "end_line": 773,
      "comment": "\n     * Returns a {@link Builder} to create an {@link Option} using descriptive\n     * methods.  \n     *\n     * @param opt short representation of the option\n     * @return a new {@link Builder} instance\n     * @throws IllegalArgumentException if there are any non valid Option characters in {@code opt}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 789,
      "end_line": 1011,
      "comment": "\n     * A nested builder class to create \u003ccode\u003eOption\u003c/code\u003e instances\n     * using descriptive methods.\n     * \u003cp\u003e\n     * Example usage:\n     * \u003cpre\u003e\n     * Option option \u003d Option.builder(\"a\")\n     *     .required(true)\n     *     .longOpt(\"arg-name\")\n     *     .build();\n     * \u003c/pre\u003e\n     * \n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": " the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 795,
      "end_line": 795,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": " the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 801,
      "end_line": 801,
      "comment": " the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 804,
      "end_line": 804,
      "comment": " specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 807,
      "end_line": 807,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 810,
      "end_line": 810,
      "comment": " the number of argument values this option can have "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 813,
      "end_line": 813,
      "comment": " the type of this Option "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 816,
      "end_line": 816,
      "comment": " the character that is the value separator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Builder.Builder(java.lang.String)",
      "begin_line": 825,
      "end_line": 829,
      "comment": "\n         * Constructs a new \u003ccode\u003eBuilder\u003c/code\u003e with the minimum\n         * required parameters for an \u003ccode\u003eOption\u003c/code\u003e instance.\n         * \n         * @param opt short representation of the option\n         * @throws IllegalArgumentException if there are any non valid Option characters in {@code opt}\n         ",
      "child_ranges": [
        "(line 827,col 13)-(line 827,col 48)",
        "(line 828,col 13)-(line 828,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.argName(java.lang.String)",
      "begin_line": 837,
      "end_line": 841,
      "comment": "\n         * Sets the display name for the argument value.\n         *\n         * @param argName the display name for the argument value.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 839,col 13)-(line 839,col 35)",
        "(line 840,col 13)-(line 840,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.desc(java.lang.String)",
      "begin_line": 849,
      "end_line": 853,
      "comment": "\n         * Sets the description for this option.\n         *\n         * @param description the description of the option.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 851,col 13)-(line 851,col 43)",
        "(line 852,col 13)-(line 852,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.longOpt(java.lang.String)",
      "begin_line": 861,
      "end_line": 865,
      "comment": "\n         * Sets the long name of the Option.\n         *\n         * @param longOpt the long name of the Option\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 863,col 13)-(line 863,col 35)",
        "(line 864,col 13)-(line 864,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.numberOfArgs(int)",
      "begin_line": 873,
      "end_line": 877,
      "comment": " \n         * Sets the number of argument values the Option can take.\n         *\n         * @param numberOfArgs the number of argument values\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 875,col 13)-(line 875,col 45)",
        "(line 876,col 13)-(line 876,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.optionalArg(boolean)",
      "begin_line": 886,
      "end_line": 890,
      "comment": "\n         * Sets whether the Option can have an optional argument.\n         *\n         * @param isOptional specifies whether the Option can have\n         * an optional argument.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 888,col 13)-(line 888,col 42)",
        "(line 889,col 13)-(line 889,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.required()",
      "begin_line": 897,
      "end_line": 900,
      "comment": "\n         * Marks this Option as required.\n         *\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 899,col 13)-(line 899,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.required(boolean)",
      "begin_line": 908,
      "end_line": 912,
      "comment": "\n         * Sets whether the Option is mandatory.\n         *\n         * @param required specifies whether the Option is mandatory\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 910,col 13)-(line 910,col 37)",
        "(line 911,col 13)-(line 911,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.type(java.lang.Class\u003c?\u003e)",
      "begin_line": 920,
      "end_line": 924,
      "comment": "\n         * Sets the type of the Option.\n         *\n         * @param type the type of the Option\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 29)",
        "(line 923,col 13)-(line 923,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.valueSeparator()",
      "begin_line": 931,
      "end_line": 934,
      "comment": "\n         * The Option will use \u0027\u003d\u0027 as a means to separate argument value.\n         *\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 933,col 13)-(line 933,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.valueSeparator(char)",
      "begin_line": 957,
      "end_line": 961,
      "comment": "\n         * The Option will use \u003ccode\u003esep\u003c/code\u003e as a means to\n         * separate argument values.\n         * \u003cp\u003e\n         * \u003cb\u003eExample:\u003c/b\u003e\n         * \u003cpre\u003e\n         * Option opt \u003d Option.builder(\"D\").hasArgs()\n         *                                 .valueSeparator(\u0027\u003d\u0027)\n         *                                 .build();\n         * Options options \u003d new Options();\n         * options.addOption(opt);\n         * String[] args \u003d {\"-Dkey\u003dvalue\"};\n         * CommandLineParser parser \u003d new DefaultParser();\n         * CommandLine line \u003d parser.parse(options, args);\n         * String propertyName \u003d line.getOptionValues(\"D\")[0];  // will be \"key\"\n         * String propertyValue \u003d line.getOptionValues(\"D\")[1]; // will be \"value\"\n         * \u003c/pre\u003e\n         *\n         * @param sep The value separator.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 959,col 13)-(line 959,col 27)",
        "(line 960,col 13)-(line 960,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArg()",
      "begin_line": 968,
      "end_line": 971,
      "comment": "\n         * Indicates that the Option will require an argument.\n         * \n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 970,col 13)-(line 970,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArg(boolean)",
      "begin_line": 979,
      "end_line": 984,
      "comment": "\n         * Indicates if the Option has an argument or not.\n         * \n         * @param hasArg specifies whether the Option takes an argument or not\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 982,col 13)-(line 982,col 61)",
        "(line 983,col 13)-(line 983,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArgs()",
      "begin_line": 991,
      "end_line": 995,
      "comment": "\n         * Indicates that the Option can have unlimited argument values.\n         * \n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 993,col 13)-(line 993,col 51)",
        "(line 994,col 13)-(line 994,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.build()",
      "begin_line": 1003,
      "end_line": 1010,
      "comment": "\n         * Constructs an Option with the values declared by this {@link Builder}.\n         * \n         * @return the new {@link Option}\n         * @throws IllegalArgumentException if neither {@code opt} or {@code longOpt} has been set\n         ",
      "child_ranges": [
        "(line 1005,col 13)-(line 1008,col 13)",
        "(line 1009,col 13)-(line 1009,col 36)"
      ]
    }
  ]
}
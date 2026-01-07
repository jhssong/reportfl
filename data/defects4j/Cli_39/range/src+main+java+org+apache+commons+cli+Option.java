{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/Option.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Option",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 1014,
      "comment": "\n * Describes a single command-line option.  It maintains\n * information regarding the short-name of the option, the long-name,\n * if any exists, a flag indicating if an argument is required for\n * this option, and a self-documenting description of the option.\n * \u003cp\u003e\n * An Option is not created independently, but is created through\n * an instance of {@link Options}. An Option is required to have\n * at least a short or a long-name.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e once an {@link Option} has been added to an instance\n * of {@link Options}, it\u0027s required flag may not be changed anymore.\n *\n * @see org.apache.commons.cli.Options\n * @see org.apache.commons.cli.CommandLine\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " constant that specifies the number of argument values has not been specified "
    },
    {
      "type": "field",
      "varNames": [
        "UNLIMITED_VALUES"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " constant that specifies the number of argument values is infinite "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " the number of argument values this option can have "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " the type of this Option "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " the list of argument values *"
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " the character that is the value separator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(org.apache.commons.cli.Option.Builder)",
      "begin_line": 88,
      "end_line": 99,
      "comment": "\n     * Private constructor used by the nested Builder class.\n     * \n     * @param builder builder used to create this option\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 39)",
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 94,col 9)-(line 94,col 31)",
        "(line 95,col 9)-(line 95,col 47)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Creates an Option using the specified parameters.\n     * The option does not take an argument.\n     *\n     * @param opt short representation of the option\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, boolean, java.lang.String)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Option(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 142,
      "end_line": 158,
      "comment": "\n     * Creates an Option using the specified parameters.\n     *\n     * @param opt short representation of the option\n     * @param longOpt the long representation of the option\n     * @param hasArg specifies whether the Option takes an argument or not\n     * @param description describes the function of the option\n     *\n     * @throws IllegalArgumentException if there are any non valid\n     * Option characters in \u003ccode\u003eopt\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 44)",
        "(line 148,col 9)-(line 148,col 23)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getId()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Returns the id of this Option.  This is only set when the\n     * Option shortOpt is a single character.  This is used for switch\n     * statements.\n     *\n     * @return the id of this Option\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getKey()",
      "begin_line": 177,
      "end_line": 181,
      "comment": "\n     * Returns the \u0027unique\u0027 Option identifier.\n     * \n     * @return the \u0027unique\u0027 Option identifier\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getOpt()",
      "begin_line": 193,
      "end_line": 196,
      "comment": " \n     * Retrieve the name of this Option.\n     *\n     * It is this String which can be used with\n     * {@link CommandLine#hasOption(String opt)} and\n     * {@link CommandLine#getOptionValue(String opt)} to check\n     * for existence and argument.\n     *\n     * @return The name of this option\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getType()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Retrieve the type of this Option.\n     * \n     * @return The type of this option\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Object)",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n     * Sets the type of this Option.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this method is kept for binary compatibility and the\n     * input type is supposed to be a {@link Class} object. \n     *\n     * @param type the type of this Option\n     * @deprecated since 1.3, use {@link #setType(Class)} instead\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setType(java.lang.Class\u003c?\u003e)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * Sets the type of this Option.\n     *\n     * @param type the type of this Option\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getLongOpt()",
      "begin_line": 239,
      "end_line": 242,
      "comment": " \n     * Retrieve the long name of this Option.\n     *\n     * @return Long name of this option, or null, if there is no long name\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setLongOpt(java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * Sets the long name of this Option.\n     *\n     * @param longOpt the long name of this Option\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setOptionalArg(boolean)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Sets whether this Option can have an optional argument.\n     *\n     * @param optionalArg specifies whether the Option can have\n     * an optional argument.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasOptionalArg()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * @return whether this Option can have an optional argument\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasLongOpt()",
      "begin_line": 278,
      "end_line": 281,
      "comment": " \n     * Query to see if this Option has a long name\n     *\n     * @return boolean flag indicating existence of a long name\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArg()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " \n     * Query to see if this Option requires an argument\n     *\n     * @return boolean flag indicating if an argument is required\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getDescription()",
      "begin_line": 298,
      "end_line": 301,
      "comment": " \n     * Retrieve the self-documenting description of this Option\n     *\n     * @return The string description of this option\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setDescription(java.lang.String)",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * Sets the self-documenting description of this Option\n     *\n     * @param description The description of this option\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.isRequired()",
      "begin_line": 319,
      "end_line": 322,
      "comment": " \n     * Query to see if this Option is mandatory\n     *\n     * @return boolean flag indicating whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setRequired(boolean)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n     * Sets whether this Option is mandatory.\n     *\n     * @param required specifies whether this Option is mandatory\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgName(java.lang.String)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Sets the display name for the argument value.\n     *\n     * @param argName the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgName()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Gets the display name for the argument value.\n     *\n     * @return the display name for the argument value.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgName()",
      "begin_line": 359,
      "end_line": 362,
      "comment": "\n     * Returns whether the display name for the argument value has been set.\n     *\n     * @return if the display name for the argument value has been set.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasArgs()",
      "begin_line": 369,
      "end_line": 372,
      "comment": " \n     * Query to see if this Option can take many values.\n     *\n     * @return boolean flag indicating if multiple values are allowed\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setArgs(int)",
      "begin_line": 379,
      "end_line": 382,
      "comment": " \n     * Sets the number of argument values this Option can take.\n     *\n     * @param num the number of argument values\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.setValueSeparator(char)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\n     * Sets the value separator.  For example if the argument value\n     * was a Java property, the value separator would be \u0027\u003d\u0027.\n     *\n     * @param sep The value separator.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValueSeparator()",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n     * Returns the value separator character.\n     *\n     * @return the value separator character.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasValueSeparator()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n     * Return whether this Option has specified a value separator.\n     * \n     * @return whether this Option has specified a value separator.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getArgs()",
      "begin_line": 430,
      "end_line": 433,
      "comment": " \n     * Returns the number of argument values this Option can take.\n     * \n     * \u003cp\u003e\n     * A value equal to the constant {@link #UNINITIALIZED} (\u003d -1) indicates\n     * the number of arguments has not been specified.\n     * A value equal to the constant {@link #UNLIMITED_VALUES} (\u003d -2) indicates\n     * that this options takes an unlimited amount of values.\n     * \u003c/p\u003e\n     *\n     * @return num the number of argument values\n     * @see #UNINITIALIZED\n     * @see #UNLIMITED_VALUES\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValueForProcessing(java.lang.String)",
      "begin_line": 440,
      "end_line": 447,
      "comment": "\n     * Adds the specified value to this Option.\n     * \n     * @param value is a/the value of this Option\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.processValue(java.lang.String)",
      "begin_line": 460,
      "end_line": 493,
      "comment": "\n     * Processes the value.  If this Option has a value separator\n     * the value will have to be parsed into individual tokens.  When\n     * n-1 tokens have been processed and there are more value separators\n     * in the value, parsing is ceased and the remaining characters are\n     * added as a single token.\n     *\n     * @param value The String to be processed.\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 489,col 9)",
        "(line 492,col 9)-(line 492,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.add(java.lang.String)",
      "begin_line": 504,
      "end_line": 513,
      "comment": "\n     * Add the value to this Option.  If the number of arguments\n     * is greater than zero and there is enough space in the list then\n     * add the value.  Otherwise, throw a runtime exception.\n     *\n     * @param value The value to be added to this Option\n     *\n     * @since 1.0.1\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 509,col 9)",
        "(line 512,col 9)-(line 512,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @return the value/first value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(int)",
      "begin_line": 539,
      "end_line": 542,
      "comment": "\n     * Returns the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @param index The index of the value to be returned.\n     *\n     * @return the specified value of this Option or \n     * \u003ccode\u003enull\u003c/code\u003e if there is no value.\n     *\n     * @throws IndexOutOfBoundsException if index is less than 1\n     * or greater than the number of the values for this Option.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValue(java.lang.String)",
      "begin_line": 554,
      "end_line": 559,
      "comment": "\n     * Returns the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there is no value.\n     *\n     * @param defaultValue The value to be returned if there\n     * is no value.\n     *\n     * @return the value/first value of this Option or the \n     * \u003ccode\u003edefaultValue\u003c/code\u003e if there are no values.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 40)",
        "(line 558,col 9)-(line 558,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValues()",
      "begin_line": 568,
      "end_line": 571,
      "comment": "\n     * Return the values of this Option as a String array \n     * or null if there are no values\n     *\n     * @return the values of this Option as a String array \n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.getValuesList()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "\n     * @return the values of this Option as a List\n     * or null if there are no values\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.toString()",
      "begin_line": 587,
      "end_line": 620,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 75)",
        "(line 592,col 9)-(line 592,col 24)",
        "(line 594,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 599,col 24)",
        "(line 601,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 47)",
        "(line 612,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 617,col 25)",
        "(line 619,col 9)-(line 619,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hasNoValues()",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\n     * Returns whether this Option has any values.\n     *\n     * @return whether this Option has any values.\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.equals(java.lang.Object)",
      "begin_line": 632,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 642,col 9)",
        "(line 644,col 9)-(line 644,col 41)",
        "(line 646,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.hashCode()",
      "begin_line": 658,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 19)",
        "(line 662,col 9)-(line 662,col 50)",
        "(line 663,col 9)-(line 663,col 74)",
        "(line 664,col 9)-(line 664,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clone()",
      "begin_line": 679,
      "end_line": 692,
      "comment": "\n     * A rather odd clone method - due to incorrect code in 1.0 it is public \n     * and in 1.1 rather than throwing a CloneNotSupportedException it throws \n     * a RuntimeException so as to maintain backwards compat at the API level. \n     *\n     * After calling this method, it is very likely you will want to call \n     * clearValues(). \n     *\n     * @return a clone of this Option instance\n     * @throws RuntimeException if a {@link CloneNotSupportedException} has been thrown\n     * by {@code super.clone()}\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.clearValues()",
      "begin_line": 700,
      "end_line": 703,
      "comment": "\n     * Clear the Option values. After a parse is complete, these are left with\n     * data in them and they need clearing if another parse is done.\n     *\n     * See: \u003ca href\u003d\"https://issues.apache.org/jira/browse/CLI-71\"\u003eCLI-71\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.addValue(java.lang.String)",
      "begin_line": 714,
      "end_line": 719,
      "comment": "\n     * This method is not intended to be used. It was a piece of internal \n     * API that was made public in 1.0. It currently throws an UnsupportedOperationException.\n     *\n     * @param value the value to add\n     * @return always throws an {@link UnsupportedOperationException}\n     * @throws UnsupportedOperationException always\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 718,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.acceptsArg()",
      "begin_line": 727,
      "end_line": 730,
      "comment": "\n     * Tells if the option can accept more arguments.\n     * \n     * @return false if the maximum number of arguments is reached\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.requiresArg()",
      "begin_line": 738,
      "end_line": 749,
      "comment": "\n     * Tells if the option requires more arguments to be valid.\n     * \n     * @return false if the option doesn\u0027t require more arguments\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.builder()",
      "begin_line": 758,
      "end_line": 761,
      "comment": "\n     * Returns a {@link Builder} to create an {@link Option} using descriptive\n     * methods.  \n     * \n     * @return a new {@link Builder} instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.builder(java.lang.String)",
      "begin_line": 772,
      "end_line": 775,
      "comment": "\n     * Returns a {@link Builder} to create an {@link Option} using descriptive\n     * methods.  \n     *\n     * @param opt short representation of the option\n     * @return a new {@link Builder} instance\n     * @throws IllegalArgumentException if there are any non valid Option characters in {@code opt}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 791,
      "end_line": 1013,
      "comment": "\n     * A nested builder class to create \u003ccode\u003eOption\u003c/code\u003e instances\n     * using descriptive methods.\n     * \u003cp\u003e\n     * Example usage:\n     * \u003cpre\u003e\n     * Option option \u003d Option.builder(\"a\")\n     *     .required(true)\n     *     .longOpt(\"arg-name\")\n     *     .build();\n     * \u003c/pre\u003e\n     * \n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "opt"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": " the name of the option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 797,
      "end_line": 797,
      "comment": " description of the option "
    },
    {
      "type": "field",
      "varNames": [
        "longOpt"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": " the long representation of the option "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 803,
      "end_line": 803,
      "comment": " the name of the argument for this option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 806,
      "end_line": 806,
      "comment": " specifies whether this option is required to be present "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": " specifies whether the argument value of this Option is optional "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 812,
      "end_line": 812,
      "comment": " the number of argument values this option can have "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 815,
      "end_line": 815,
      "comment": " the type of this Option "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 818,
      "end_line": 818,
      "comment": " the character that is the value separator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Option.Builder.Builder(java.lang.String)",
      "begin_line": 827,
      "end_line": 831,
      "comment": "\n         * Constructs a new \u003ccode\u003eBuilder\u003c/code\u003e with the minimum\n         * required parameters for an \u003ccode\u003eOption\u003c/code\u003e instance.\n         * \n         * @param opt short representation of the option\n         * @throws IllegalArgumentException if there are any non valid Option characters in {@code opt}\n         ",
      "child_ranges": [
        "(line 829,col 13)-(line 829,col 48)",
        "(line 830,col 13)-(line 830,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.argName(java.lang.String)",
      "begin_line": 839,
      "end_line": 843,
      "comment": "\n         * Sets the display name for the argument value.\n         *\n         * @param argName the display name for the argument value.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 841,col 13)-(line 841,col 35)",
        "(line 842,col 13)-(line 842,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.desc(java.lang.String)",
      "begin_line": 851,
      "end_line": 855,
      "comment": "\n         * Sets the description for this option.\n         *\n         * @param description the description of the option.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 853,col 13)-(line 853,col 43)",
        "(line 854,col 13)-(line 854,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.longOpt(java.lang.String)",
      "begin_line": 863,
      "end_line": 867,
      "comment": "\n         * Sets the long name of the Option.\n         *\n         * @param longOpt the long name of the Option\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 865,col 13)-(line 865,col 35)",
        "(line 866,col 13)-(line 866,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.numberOfArgs(int)",
      "begin_line": 875,
      "end_line": 879,
      "comment": " \n         * Sets the number of argument values the Option can take.\n         *\n         * @param numberOfArgs the number of argument values\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 877,col 13)-(line 877,col 45)",
        "(line 878,col 13)-(line 878,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.optionalArg(boolean)",
      "begin_line": 888,
      "end_line": 892,
      "comment": "\n         * Sets whether the Option can have an optional argument.\n         *\n         * @param isOptional specifies whether the Option can have\n         * an optional argument.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 42)",
        "(line 891,col 13)-(line 891,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.required()",
      "begin_line": 899,
      "end_line": 902,
      "comment": "\n         * Marks this Option as required.\n         *\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.required(boolean)",
      "begin_line": 910,
      "end_line": 914,
      "comment": "\n         * Sets whether the Option is mandatory.\n         *\n         * @param required specifies whether the Option is mandatory\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 912,col 13)-(line 912,col 37)",
        "(line 913,col 13)-(line 913,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.type(java.lang.Class\u003c?\u003e)",
      "begin_line": 922,
      "end_line": 926,
      "comment": "\n         * Sets the type of the Option.\n         *\n         * @param type the type of the Option\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 924,col 13)-(line 924,col 29)",
        "(line 925,col 13)-(line 925,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.valueSeparator()",
      "begin_line": 933,
      "end_line": 936,
      "comment": "\n         * The Option will use \u0027\u003d\u0027 as a means to separate argument value.\n         *\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 935,col 13)-(line 935,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.valueSeparator(char)",
      "begin_line": 959,
      "end_line": 963,
      "comment": "\n         * The Option will use \u003ccode\u003esep\u003c/code\u003e as a means to\n         * separate argument values.\n         * \u003cp\u003e\n         * \u003cb\u003eExample:\u003c/b\u003e\n         * \u003cpre\u003e\n         * Option opt \u003d Option.builder(\"D\").hasArgs()\n         *                                 .valueSeparator(\u0027\u003d\u0027)\n         *                                 .build();\n         * Options options \u003d new Options();\n         * options.addOption(opt);\n         * String[] args \u003d {\"-Dkey\u003dvalue\"};\n         * CommandLineParser parser \u003d new DefaultParser();\n         * CommandLine line \u003d parser.parse(options, args);\n         * String propertyName \u003d line.getOptionValues(\"D\")[0];  // will be \"key\"\n         * String propertyValue \u003d line.getOptionValues(\"D\")[1]; // will be \"value\"\n         * \u003c/pre\u003e\n         *\n         * @param sep The value separator.\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 961,col 13)-(line 961,col 27)",
        "(line 962,col 13)-(line 962,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArg()",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n         * Indicates that the Option will require an argument.\n         * \n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 972,col 13)-(line 972,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArg(boolean)",
      "begin_line": 981,
      "end_line": 986,
      "comment": "\n         * Indicates if the Option has an argument or not.\n         * \n         * @param hasArg specifies whether the Option takes an argument or not\n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 984,col 13)-(line 984,col 61)",
        "(line 985,col 13)-(line 985,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.hasArgs()",
      "begin_line": 993,
      "end_line": 997,
      "comment": "\n         * Indicates that the Option can have unlimited argument values.\n         * \n         * @return this builder, to allow method chaining\n         ",
      "child_ranges": [
        "(line 995,col 13)-(line 995,col 51)",
        "(line 996,col 13)-(line 996,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Option.Builder.build()",
      "begin_line": 1005,
      "end_line": 1012,
      "comment": "\n         * Constructs an Option with the values declared by this {@link Builder}.\n         * \n         * @return the new {@link Option}\n         * @throws IllegalArgumentException if neither {@code opt} or {@code longOpt} has been set\n         ",
      "child_ranges": [
        "(line 1007,col 13)-(line 1010,col 13)",
        "(line 1011,col 13)-(line 1011,col 36)"
      ]
    }
  ]
}
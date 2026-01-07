{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/Option.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Option",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 197,
      "comment": "\n * The super type of all options representing a particular element of the\n * command line interface.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Processes String arguments into a CommandLine.\n     * \n     * The iterator will initially point at the first argument to be processed\n     * and at the end of the method should point to the first argument not\n     * processed. This method MUST process at least one argument from the\n     * ListIterator.\n     * \n     * @param commandLine\n     *            The CommandLine object to store results in\n     * @param args\n     *            The arguments to process\n     * @throws OptionException\n     *             if any problems occur\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Adds defaults to a CommandLine.\n     * \n     * Any defaults for this option are applied as well as the defaults for \n     * any contained options\n     * \n     * @param commandLine\n     *            The CommandLine object to store defaults in\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Indicates whether this Option will be able to process the particular\n     * argument.\n     * \n     * @param argument\n     *            The argument to be tested\n     * @return true if the argument can be processed by this Option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Indicates whether this Option will be able to process the particular\n     * argument. The ListIterator must be restored to the initial state before\n     * returning the boolean.\n     * \n     * @see #canProcess(WriteableCommandLine,String)\n     * @param arguments\n     *            the ListIterator over String arguments\n     * @return true if the argument can be processed by this Option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.getTriggers()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Identifies the argument prefixes that should trigger this option. This\n     * is used to decide which of many Options should be tried when processing\n     * a given argument string.\n     * \n     * The returned Set must not be null.\n     * \n     * @return The set of triggers for this Option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.getPrefixes()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Identifies the argument prefixes that should be considered options. This\n     * is used to identify whether a given string looks like an option or an\n     * argument value. Typically an option would return the set [--,-] while\n     * switches might offer [-,+].\n     * \n     * The returned Set must not be null.\n     * \n     * @return The set of prefixes for this Option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 115,
      "end_line": 116,
      "comment": "\n     * Checks that the supplied CommandLine is valid with respect to this\n     * option.\n     * \n     * @param commandLine\n     *            The CommandLine to check.\n     * @throws OptionException\n     *             if the CommandLine is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Builds up a list of HelpLineImpl instances to be presented by HelpFormatter.\n     * \n     * @see HelpLine\n     * @see org.apache.commons.cli2.util.HelpFormatter\n     * @param depth\n     *            the initial indent depth\n     * @param helpSettings\n     *            the HelpSettings that should be applied\n     * @param comp\n     *            a comparator used to sort options when applicable.\n     * @return a List of HelpLineImpl objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * Appends usage information to the specified StringBuffer\n     * \n     * @param buffer the buffer to append to\n     * @param helpSettings a set of display settings @see DisplaySetting\n     * @param comp a comparator used to sort the Options\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.getPreferredName()",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * The preferred name of an option is used for generating help and usage\n     * information.\n     * \n     * @return The preferred name of the option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.getDescription()",
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Returns a description of the option. This string is used to build help\n     * messages as in the HelpFormatter.\n     * \n     * @see org.apache.commons.cli2.util.HelpFormatter\n     * @return a description of the option.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.getId()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Returns the id of the option.  This can be used in a loop and switch \n     * construct:\n     * \n     * \u003ccode\u003e\n     * for(Option o : cmd.getOptions()){\n     *     switch(o.getId()){\n     *         case POTENTIAL_OPTION:\n     *             ...\n     *     }\n     * }\n     * \u003c/code\u003e \n     * \n     * The returned value is not guarenteed to be unique.\n     * \n     * @return the id of the option.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.findOption(java.lang.String)",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n\t * Recursively searches for an option with the supplied trigger.\n\t *\n\t * @param trigger the trigger to search for.\n\t * @return the matching option or null.\n\t ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Option.isRequired()",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Indicates whether this option is required to be present.\n     * @return true iff the CommandLine will be invalid without this Option\n     ",
      "child_ranges": []
    }
  ]
}
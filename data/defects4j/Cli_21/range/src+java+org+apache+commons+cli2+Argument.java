{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/Argument.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Argument",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 25,
      "end_line": 107,
      "comment": "\n * An Option that can process values passed on the command line in the form\n * \"--file README\".\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.getInitialSeparator()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Returns the initial separator character or\n     * \u0027\\0\u0027 if no character has been set.\n     *\n     * @return char the initial separator character\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.processValues(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator, org.apache.commons.cli2.Option)",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Processes the \"README\" style element of the argument.\n     *\n     * Values identified should be added to the CommandLine object in\n     * association with this Argument.\n     *\n     * @see WriteableCommandLine#addValue(Option,Object)\n     *\n     * @param commandLine The CommandLine object to store results in.\n     * @param args The arguments to process.\n     * @param option The option to register value against.\n     * @throws OptionException if any problems occur.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.defaultValues(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Adds defaults to a CommandLine.\n     *\n     * @param commandLine\n     *            The CommandLine object to store defaults in.\n     * @param option\n     *            The Option to store the defaults against.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.validate(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * Performs any necessary validation on the values added to the\n     * CommandLine.\n     *\n     * Validation will typically involve using the\n     * CommandLine.getValues(option) method to retrieve the values\n     * and then either checking each value.  Optionally the String\n     * value can be replaced by another Object such as a Number\n     * instance or a File instance.\n     *\n     * @see CommandLine#getValues(Option)\n     *\n     * @param commandLine The CommandLine object to query.\n     * @param option The option to lookup values with.\n     * @throws OptionException if any problems occur.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.isRequired()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Indicates whether argument values must be present for the CommandLine to\n     * be valid.\n     *\n     * @see #getMinimum()\n     * @see #getMaximum()\n     * @return true iff the CommandLine will be invalid without at least one\n     *         value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.getMinimum()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Retrieves the minimum number of values required for a valid Argument\n     *\n     * @return the minimum number of values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Argument.getMaximum()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Retrieves the maximum number of values acceptable for a valid Argument\n     *\n     * @return the maximum number of values\n     ",
      "child_ranges": []
    }
  ]
}
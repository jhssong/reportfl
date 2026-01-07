{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 215,
      "comment": "\n * Instances of CommandLine represent a command line that has been processed\n * according to the definition supplied to the parser.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.hasOption(java.lang.String)",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Detects the presence of an option with the specified trigger in this\n     * CommandLine.\n     *\n     * @param trigger the trigger to search for\n     * @return true iff an option with this trigger is present\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Detects the presence of an option in this CommandLine.\n     *\n     * @param option the Option to search for\n     * @return true iff the option is present\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getOption(java.lang.String)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Finds the Option with the specified trigger\n     *\n     * @param trigger the name of the option to retrieve\n     * @return the Option matching the trigger or null if none exists\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValues(java.lang.String)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Retrieves the Argument values associated with the specified Option\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @return a list of values or an empty List if none are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValues(java.lang.String, java.util.List)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Retrieves the Argument values associated with the specified Option\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @param defaultValues the result to return if no values are found\n     * @return a list of values or defaultValues if none are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValues(org.apache.commons.cli2.Option)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Retrieves the Argument values associated with the specified Option\n     *\n     * @param option the Option associated with the values\n     * @return a list of values or an empty List if none are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Retrieves the Argument values associated with the specified Option\n     *\n     * @param option the Option associated with the values\n     * @param defaultValues the result to return if no values are found\n     * @return a list of values or defaultValues if none are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValue(java.lang.String)",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Retrieves the single Argument value associated with the specified Option\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @return the matching value or null if none exists\n     * @throws IllegalStateException if more than one values are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValue(java.lang.String, java.lang.Object)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Retrieves the single Argument value associated with the specified Option\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @param defaultValue the result to use if no values are found\n     * @return the matching value or defaultValue if none exists\n     * @throws IllegalStateException if more than one values are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValue(org.apache.commons.cli2.Option)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Retrieves the single Argument value associated with the specified Option\n     *\n     * @param option the Option associated with the value\n     * @return the matching value or null if none exists\n     * @throws IllegalStateException if more than one values are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getValue(org.apache.commons.cli2.Option, java.lang.Object)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Retrieves the single Argument value associated with the specified Option\n     *\n     * @param option the Option associated with the value\n     * @param defaultValue the result to use if no values are found\n     * @return the matching value or defaultValue if none exists\n     * @throws IllegalStateException if more than one values are found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getSwitch(java.lang.String)",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Retrieves the Boolean value associated with the specified Switch\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @return the Boolean associated with trigger or null if none exists\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getSwitch(java.lang.String, java.lang.Boolean)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Retrieves the Boolean value associated with the specified Switch\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @param defaultValue the Boolean to use if none match\n     * @return the Boolean associated with trigger or defaultValue if none exists\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getSwitch(org.apache.commons.cli2.Option)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Retrieves the Boolean value associated with the specified Switch\n     *\n     * @param option the Option associated with the value\n     * @return the Boolean associated with option or null if none exists\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Retrieves the Boolean value associated with the specified Switch\n     *\n     * @param option the Option associated with the value\n     * @param defaultValue the Boolean to use if none match\n     * @return the Boolean associated with option or defaultValue if none exists\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getProperty(java.lang.String)",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Retrieves the value associated with the specified property\n     *\n     * @param property the property name to lookup\n     * @return the value of the property or null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getProperty(java.lang.String, java.lang.String)",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Retrieves the value associated with the specified property\n     *\n     * @param property the property name to lookup\n     * @param defaultValue the value to use if no other is found\n     * @return the value of the property or defaultValue\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getProperties()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Retrieves the set of all property names associated with this CommandLine\n     *\n     * @return a none null set of property names\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getOptionCount(java.lang.String)",
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Retrieves the number of times the specified Option appeared in this\n     * CommandLine\n     *\n     * @param trigger a trigger used to lookup the Option\n     * @return the number of occurrences of the option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getOptionCount(org.apache.commons.cli2.Option)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Retrieves the number of times the specified Option appeared in this\n     * CommandLine\n     *\n     * @param option the Option associated to check\n     * @return the number of occurrences of the option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getOptions()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n     * Retrieves a list of all Options found in this CommandLine\n     *\n     * @return a none null list of Options\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.CommandLine.getOptionTriggers()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Retrieves a list of all Option triggers found in this CommandLine\n     *\n     * @return a none null list of Option triggers\n     ",
      "child_ranges": []
    }
  ]
}
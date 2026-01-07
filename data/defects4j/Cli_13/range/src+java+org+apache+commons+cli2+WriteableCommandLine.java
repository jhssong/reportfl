{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/WriteableCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WriteableCommandLine",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.cli2.CommandLine"
      ],
      "begin_line": 24,
      "end_line": 85,
      "comment": "\n * A CommandLine that detected values and options can be written to.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.addOption(org.apache.commons.cli2.Option)",
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * Adds an Option to the CommandLine\n     * @param option the Option to add\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.addValue(org.apache.commons.cli2.Option, java.lang.Object)",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Adds a value to an Option in the CommandLine.\n     * @param option the Option to add to\n     * @param value the value to add\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.setDefaultValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Sets the default values for an Option in the CommandLine\n     * @param option the Option to add to\n     * @param defaultValues the defaults for the option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.addSwitch(org.apache.commons.cli2.Option, boolean)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Adds a switch value to an Option in the CommandLine.\n     * @param option the Option to add to\n     * @param value the switch value to add\n     * @throws IllegalStateException if the switch has already been added\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Sets the default state for a Switch in the CommandLine.\n     * @param option the Option to add to\n     * @param defaultSwitch the defaults state for ths switch\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Adds a property value to a name in the CommandLine.\n     * Replaces any existing value for the property.\n     *\n     * @param property the name of the property\n     * @param value the value of the property\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.WriteableCommandLine.looksLikeOption(java.lang.String)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Detects whether the argument looks like an Option trigger\n     * @param argument the argument to test\n     * @return true if the argument looks like an Option trigger\n     ",
      "child_ranges": []
    }
  ]
}
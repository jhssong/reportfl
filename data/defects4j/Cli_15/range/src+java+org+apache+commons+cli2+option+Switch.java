{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/option/Switch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Switch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.ParentImpl"
      ],
      "begin_line": 40,
      "end_line": 248,
      "comment": "\n * A Parent implementation representing normal switch options.\n * For example: \u003ccode\u003e+d|-d\u003c/code\u003e or \u003ccode\u003e--enable-x|--disable-x\u003c/code\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "resources"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " i18n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENABLED_PREFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The default prefix for enabled switches\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DISABLED_PREFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The default prefix for disabled switches\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enabledPrefix"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "disabledPrefix"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "triggers"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferredName"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultSwitch"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.Switch.Switch(java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.lang.String, boolean, org.apache.commons.cli2.Argument, org.apache.commons.cli2.Group, int, java.lang.Boolean)",
      "begin_line": 76,
      "end_line": 137,
      "comment": "\n     * Creates a new Switch with the specified parameters\n     * @param enabledPrefix the prefix used for enabled switches\n     * @param disabledPrefix the prefix used for disabled switches\n     * @param preferredName the preferred name of the switch\n     * @param aliases the aliases by which the Switch is known\n     * @param description a description of the Switch\n     * @param required whether the Option is strictly required\n     * @param argument the Argument belonging to this Parent, or null\n     * @param children the Group children belonging to this Parent, ot null\n     * @param id the unique identifier for this Option\n     * @throws IllegalArgumentException if the preferredName or an alias isn\u0027t\n     *     prefixed with enabledPrefix or disabledPrefix\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 61)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 45)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 113,col 9)-(line 113,col 55)",
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 65)",
        "(line 117,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 40)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 134,col 9)-(line 134,col 43)",
        "(line 136,col 9)-(line 136,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.processParent(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 139,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 53)",
        "(line 144,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.getTriggers()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.getPrefixes()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 167,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 177,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 182,col 84)",
        "(line 183,col 9)-(line 183,col 93)",
        "(line 184,col 9)-(line 184,col 95)",
        "(line 185,col 9)-(line 186,col 86)",
        "(line 187,col 9)-(line 187,col 49)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 54)",
        "(line 236,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.getPreferredName()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Switch.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 58)"
      ]
    }
  ]
}
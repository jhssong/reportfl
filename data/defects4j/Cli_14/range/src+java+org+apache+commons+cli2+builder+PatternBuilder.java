{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/builder/PatternBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PatternBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 202,
      "comment": "TODO Document and link to the acceptable patterns"
    },
    {
      "type": "field",
      "varNames": [
        "gbuilder"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obuilder"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "abuilder"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.PatternBuilder()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Creates a new PatternBuilder\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 49,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.PatternBuilder(org.apache.commons.cli2.builder.GroupBuilder, org.apache.commons.cli2.builder.DefaultOptionBuilder, org.apache.commons.cli2.builder.ArgumentBuilder)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Creates a new PatternBuilder\n     * @param gbuilder the GroupBuilder to use\n     * @param obuilder the DefaultOptionBuilder to use\n     * @param abuilder the ArgumentBuilder to use\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)",
        "(line 63,col 9)-(line 63,col 33)",
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.create()",
      "begin_line": 73,
      "end_line": 90,
      "comment": "\n     * Creates a new Option instance.\n     * @return a new Option instance\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 28)",
        "(line 76,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 16)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.reset()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Resets this builder\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 24)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.createOption(char, boolean, char)",
      "begin_line": 100,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 40)",
        "(line 122,col 9)-(line 122,col 52)",
        "(line 123,col 9)-(line 123,col 40)",
        "(line 125,col 9)-(line 125,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.withPattern(java.lang.String)",
      "begin_line": 132,
      "end_line": 172,
      "comment": "\n     * Builds an Option using a pattern string.\n     * @param pattern the pattern to build from\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 34)",
        "(line 135,col 9)-(line 135,col 23)",
        "(line 136,col 9)-(line 136,col 22)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 140,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.PatternBuilder.validator(char)",
      "begin_line": 174,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 200,col 9)"
      ]
    }
  ]
}
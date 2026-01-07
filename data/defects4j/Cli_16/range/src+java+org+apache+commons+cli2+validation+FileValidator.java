{
  "filepath": "/tmp/Cli-16b/src/java/org/apache/commons/cli2/validation/FileValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FileValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 59,
      "end_line": 265,
      "comment": "\n * The \u003ccode\u003eFileValidator\u003c/code\u003e validates the string argument\n * values are files.  If the value is a file, the string value in\n * the {@link java.util.List} of values is replaced with the\n * {@link java.io.File} instance.\n *\n * The following attributes can also be specified using the\n * appropriate settors:\n * \u003cul\u003e\n *  \u003cli\u003ewritable\u003c/li\u003e\n *  \u003cli\u003ereadable\u003c/li\u003e\n *  \u003cli\u003ehidden\u003c/li\u003e\n *  \u003cli\u003eexisting\u003c/li\u003e\n *  \u003cli\u003eis a file\u003c/li\u003e\n *  \u003cli\u003eis a directory\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * The following example shows how to limit the valid values\n * for the config attribute to files that are readable, writeable,\n * and that already existing.\n *\n * \u003cpre\u003e\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * FileValidator validator \u003d FileValidator.getExistingFileInstance();\n * validator.setReadable(true);\n * validator.setWritable(true);\n *\n * Argument age \u003d\n *     builder.withName(\"config\");\n *            .withValidator(validator);\n * \u003c/pre\u003e\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.getExistingInstance()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Returns a \u003ccode\u003eFileValidator\u003c/code\u003e for existing files/directories.\n     *\n     * @return a \u003ccode\u003eFileValidator\u003c/code\u003e for existing files/directories.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)",
        "(line 68,col 9)-(line 68,col 36)",
        "(line 69,col 9)-(line 69,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.getExistingFileInstance()",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * Returns a \u003ccode\u003eFileValidator\u003c/code\u003e for existing files.\n     *\n     * @return a \u003ccode\u003eFileValidator\u003c/code\u003e for existing files.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance()",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Returns a \u003ccode\u003eFileValidator\u003c/code\u003e for existing directories.\n     *\n     * @return a \u003ccode\u003eFileValidator\u003c/code\u003e for existing directories.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 60)",
        "(line 91,col 9)-(line 91,col 36)",
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "readable"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " whether the argument value is readable "
    },
    {
      "type": "field",
      "varNames": [
        "writable"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " whether the argument value is writable "
    },
    {
      "type": "field",
      "varNames": [
        "existing"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " whether the argument value exists "
    },
    {
      "type": "field",
      "varNames": [
        "directory"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " whether the argument value is a directory "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " whether the argument value is a file "
    },
    {
      "type": "field",
      "varNames": [
        "hidden"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " whether the argument value is a hidden file or directory "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.validate(java.util.List)",
      "begin_line": 121,
      "end_line": 138,
      "comment": "\n     * Validate the list of values against the list of permitted values.\n     * If a value is valid, replace the string in the \u003ccode\u003evalues\u003c/code\u003e\n     * {@link java.util.List} with the {@link java.io.File} instance.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isDirectory()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Returns whether the argument values must represent directories.\n     *\n     * @return whether the argument values must represent directories.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setDirectory(boolean)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Specifies whether the argument values must represent directories.\n     *\n     * @param directory specifies whether the argument values must\n     * represent directories.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isExisting()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns whether the argument values must represent existing\n     * files/directories.\n     *\n     * @return whether the argument values must represent existing\n     * files/directories.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setExisting(boolean)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Specifies whether the argument values must represent existing\n     * files/directories.\n     *\n     * @param existing specifies whether the argument values must\n     * represent existing files/directories.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isFile()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns whether the argument values must represent directories.\n     *\n     * @return whether the argument values must represent directories.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setFile(boolean)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Specifies whether the argument values must represent files.\n     *\n     * @param file specifies whether the argument values must\n     * represent files.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isHidden()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Returns whether the argument values must represent hidden\n     * files/directories.\n     *\n     * @return whether the argument values must represent hidden\n     * files/directories.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setHidden(boolean)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Specifies whether the argument values must represent hidden\n     * files/directories.\n     *\n     * @param hidden specifies whether the argument values must\n     * represent hidden files/directories.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isReadable()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns whether the argument values must represent readable\n     * files/directories.\n     *\n     * @return whether the argument values must represent readable\n     * files/directories.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setReadable(boolean)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Specifies whether the argument values must represent readable\n     * files/directories.\n     *\n     * @param readable specifies whether the argument values must\n     * represent readable files/directories.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.isWritable()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Returns whether the argument values must represent writable\n     * files/directories.\n     *\n     * @return whether the argument values must represent writable\n     * files/directories.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.FileValidator.setWritable(boolean)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Specifies whether the argument values must represent writable\n     * files/directories.\n     *\n     * @param writable specifies whether the argument values must\n     * represent writable files/directories.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 33)"
      ]
    }
  ]
}
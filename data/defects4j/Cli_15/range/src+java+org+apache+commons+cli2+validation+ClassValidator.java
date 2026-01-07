{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/validation/ClassValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 45,
      "end_line": 201,
      "comment": "\n * The \u003ccode\u003eClassValidator\u003c/code\u003e validates the string argument\n * values are class names.\n *\n * The following example shows how to validate the \u0027logger\u0027\n * argument value is a class name, that can be instantiated.\n *\n * \u003cpre\u003e\n * ...\n * ClassValidator validator \u003d new ClassValidator();\n * validator.setInstance(true);\n *\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * Argument logger \u003d\n *     builder.withName(\"logger\");\n *            .withValidator(validator);\n * \u003c/pre\u003e\n *\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "resources"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " i18n "
    },
    {
      "type": "field",
      "varNames": [
        "loadable"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " whether the class argument is loadable "
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " whether to create an instance of the class "
    },
    {
      "type": "field",
      "varNames": [
        "loader"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the classloader to load classes from "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.validate(java.util.List)",
      "begin_line": 67,
      "end_line": 100,
      "comment": "\n     * Validate each argument value in the specified List against this instances\n     * permitted attributes.\n     *\n     * If a value is valid then it\u0027s \u003ccode\u003eString\u003c/code\u003e value in the list is\n     * replaced with it\u0027s \u003ccode\u003eClass\u003c/code\u003e value or instance.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.isLoadable()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns whether the argument value must represent a\n     * class that is loadable.\n     *\n     * @return whether the argument value must represent a\n     * class that is loadable.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.setLoadable(boolean)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Specifies whether the argument value must represent a\n     * class that is loadable.\n     *\n     * @param loadable whether the argument value must\n     * represent a class that is loadable.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.getClassLoader()",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Returns the {@link ClassLoader} used to resolve and load\n     * the classes specified by the argument values.\n     *\n     * @return the {@link ClassLoader} used to resolve and load\n     * the classes specified by the argument values.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.setClassLoader(java.lang.ClassLoader)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Specifies the {@link ClassLoader} used to resolve and load\n     * the classes specified by the argument values.\n     *\n     * @param loader the {@link ClassLoader} used to resolve and load\n     * the classes specified by the argument values.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.isInstance()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Returns whether the argument value must represent a\n     * class that can be instantiated.\n     *\n     * @return whether the argument value must represent a\n     * class that can be instantiated.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.setInstance(boolean)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Specifies whether the argument value must represent a\n     * class that can be instantiated.\n     *\n     * @param instance whether the argument value must\n     * represent a class that can be instantiated.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.ClassValidator.isPotentialClassName(java.lang.String)",
      "begin_line": 176,
      "end_line": 200,
      "comment": "\n     * Returns whether the specified name is allowed as\n     * a Java class name.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 48)",
        "(line 179,col 9)-(line 179,col 38)",
        "(line 181,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 31)"
      ]
    }
  ]
}
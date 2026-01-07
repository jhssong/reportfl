{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/JavaVersion.java",
  "nodes": [
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The float value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * The standard name.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.JavaVersion.JavaVersion(float, java.lang.String)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Constructor.\n     *\n     * @param value  the float value\n     * @param name  the standard name, not null\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.JavaVersion.atLeast(org.apache.commons.lang3.JavaVersion)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eWhether this version of Java is at least the version of Java passed in.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     *  {@code myVersion.atLeast(JavaVersion.JAVA_1_4)}\u003cp\u003e\n     *\n     * @param requiredVersion  the version to check against, not null\n     * @return true if this version is equal to or greater than the specified version\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.JavaVersion.getJavaVersion(java.lang.String)",
      "begin_line": 118,
      "end_line": 120,
      "comment": " helper for static importing",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.JavaVersion.get(java.lang.String)",
      "begin_line": 131,
      "end_line": 153,
      "comment": "\n     * Transforms the given string with a Java version number to the\n     * corresponding constant of this enumeration class. This method is used\n     * internally.\n     *\n     * @param nom the Java version as string\n     * @return the corresponding enumeration constant or \u003cb\u003enull\u003c/b\u003e if the\n     * version is unknown\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.JavaVersion.toString()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eThe string value is overridden to return the standard name.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, \u003ccode\u003e\"1.5\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the name, not null\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 20)"
      ]
    }
  ]
}
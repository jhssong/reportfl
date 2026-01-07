{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/util/MethodLookupUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodLookupUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 319,
      "comment": "\n * Method lookup utilities, which find static and non-static methods as well\n * as constructors based on a name and list of parameters.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NO_MATCH"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APPROXIMATE_MATCH"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXACT_MATCH"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.MethodLookupUtils.lookupConstructor(java.lang.Class, java.lang.Object[])",
      "begin_line": 46,
      "end_line": 104,
      "comment": "\n     * Look up a constructor.\n     * @param targetClass the class constructed\n     * @param parameters arguments\n     * @return Constructor found if any.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)",
        "(line 50,col 9)-(line 50,col 63)",
        "(line 51,col 9)-(line 51,col 41)",
        "(line 52,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 63,col 39)",
        "(line 65,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 29)",
        "(line 79,col 9)-(line 79,col 34)",
        "(line 82,col 9)-(line 82,col 67)",
        "(line 83,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.MethodLookupUtils.lookupStaticMethod(java.lang.Class, java.lang.String, java.lang.Object[])",
      "begin_line": 113,
      "end_line": 175,
      "comment": "\n     * Look up a static method.\n     * @param targetClass the owning class\n     * @param name method name\n     * @param parameters method parameters\n     * @return Method found if any\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 32)",
        "(line 118,col 9)-(line 118,col 63)",
        "(line 119,col 9)-(line 119,col 41)",
        "(line 120,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 133,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 29)",
        "(line 148,col 9)-(line 148,col 34)",
        "(line 151,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.MethodLookupUtils.lookupMethod(java.lang.Class, java.lang.String, java.lang.Object[])",
      "begin_line": 184,
      "end_line": 260,
      "comment": "\n     * Look up a method.\n     * @param targetClass owning class\n     * @param name method name\n     * @param parameters method parameters\n     * @return Method found if any\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 79)",
        "(line 200,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 202,col 41)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 29)",
        "(line 218,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 34)",
        "(line 236,col 9)-(line 236,col 52)",
        "(line 237,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.MethodLookupUtils.matchParameterTypes(java.lang.Class[], java.lang.Object[])",
      "begin_line": 268,
      "end_line": 291,
      "comment": "\n     * Return a match code of objects to types.\n     * @param types Class[] of expected types\n     * @param parameters Object[] to attempt to match\n     * @return int code\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 19)",
        "(line 272,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 64)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 37)",
        "(line 281,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.MethodLookupUtils.matchType(java.lang.Class, java.lang.Object)",
      "begin_line": 299,
      "end_line": 318,
      "comment": "\n     * Return a match code between an object and type.\n     * @param expected class to test\n     * @param object object to test\n     * @return int code\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 41)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 24)"
      ]
    }
  ]
}
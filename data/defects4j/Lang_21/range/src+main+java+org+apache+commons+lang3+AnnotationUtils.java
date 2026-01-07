{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 300,
      "comment": "\n * Helper methods for working with {@link Annotation}s.\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TO_STRING_STYLE"
      ],
      "begin_line": 33,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-c940c398-25a0-468a-b1e3-e2531151d7ac.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 53,
      "end_line": 67,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 62)",
        "(line 56,col 13)-(line 64,col 13)",
        "(line 65,col 13)-(line 66,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-3dff4103-3c89-47a6-aae8-46b938b3c16d.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 74,col 13)-(line 76,col 13)",
        "(line 77,col 13)-(line 77,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.AnnotationUtils.AnnotationUtils()",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eAnnotationUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used statically.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.equals(java.lang.annotation.Annotation, java.lang.annotation.Annotation)",
      "begin_line": 101,
      "end_line": 132,
      "comment": "\n     * Learn whether two annotations are equivalent; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#equals(Object)}\n     * per spec.\n     * @param a1 the first Annotation to compare\n     * @param a2 the second Annotation to compare\n     * @return Whether the two annotations are equal\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 109,col 64)",
        "(line 110,col 9)-(line 110,col 79)",
        "(line 111,col 9)-(line 111,col 80)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashCode(java.lang.annotation.Annotation)",
      "begin_line": 146,
      "end_line": 154,
      "comment": "\n     * Generate a hashcode for the given annotation; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#hashCode()} per\n     * spec.\n     * \n     * @param a the Annotation for a hashcode calculation is desired\n     * @return the calculated hashcode\n     * @throws IllegalArgumentException\n     * @throws IllegalAccessException\n     * @throws InvocationTargetException\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)",
        "(line 149,col 9)-(line 149,col 62)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.toString(java.lang.annotation.Annotation)",
      "begin_line": 162,
      "end_line": 177,
      "comment": "\n     * Generate a string representation of an Annotation, as suggested by\n     * {@link Annotation#toString()}.\n     * @param a the annotation of which a string representation is desired\n     * @return String\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 74)",
        "(line 164,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class\u003c?\u003e)",
      "begin_line": 186,
      "end_line": 195,
      "comment": "\n     * Learn whether the specified type is permitted as an annotation member.\n     * These include {@link String}, {@link Class}, primitive types,\n     * {@link Annotation}s, {@link Enum}s, and arrays of same.\n     * @param type to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 194,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashMember(java.lang.String, java.lang.Object)",
      "begin_line": 198,
      "end_line": 211,
      "comment": "besides modularity, this has the advantage of autoboxing primitives:",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 42)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.memberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 213,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 229,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(java.lang.annotation.Annotation[], java.lang.annotation.Annotation[])",
      "begin_line": 260,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 272,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 45)"
      ]
    }
  ]
}
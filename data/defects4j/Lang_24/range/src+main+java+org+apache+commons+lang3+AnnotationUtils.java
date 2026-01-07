{
  "filepath": "/tmp/Lang-24b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 297,
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
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-3d9ada0d-0352-4a4f-8cd5-0db6ccfd0c85.getShortClassName(java.lang.Class\u003c?\u003e)",
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
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-278bcca7-a378-4502-8f65-790c794cfee0.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
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
      "begin_line": 100,
      "end_line": 129,
      "comment": "\n     * Learn whether two annotations are equivalent; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#equals(Object)}\n     * per spec.\n     * @param a1 the first Annotation to compare\n     * @param a2 the second Annotation to compare\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 64)",
        "(line 109,col 9)-(line 109,col 79)",
        "(line 110,col 9)-(line 110,col 80)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashCode(java.lang.annotation.Annotation)",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\n     * Generate a hashcode for the given annotation; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#hashCode()} per\n     * spec.\n     * \n     * @param a the Annotation for a hashcode calculation is desired\n     * @return the calculated hashcode\n     * @throws InvocationTargetException\n     * @throws IllegalAccessException\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 23)",
        "(line 146,col 9)-(line 146,col 62)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.toString(java.lang.annotation.Annotation)",
      "begin_line": 159,
      "end_line": 174,
      "comment": "\n     * Generate a string representation of an Annotation, as suggested by\n     * {@link Annotation#toString()}.\n     * @param a the annotation of which a string representation is desired\n     * @return String\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 74)",
        "(line 161,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class\u003c?\u003e)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Learn whether the specified type is permitted as an annotation member.\n     * These include {@link String}, {@link Class}, primitive types,\n     * {@link Annotation}s, {@link Enum}s, and arrays of same.\n     * @param type to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 191,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashMember(java.lang.String, java.lang.Object)",
      "begin_line": 195,
      "end_line": 208,
      "comment": "besides modularity, this has the advantage of autoboxing primitives:",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 42)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.memberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 210,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 226,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(java.lang.annotation.Annotation[], java.lang.annotation.Annotation[])",
      "begin_line": 257,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 269,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 45)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 295,
      "comment": "\n * Helper methods for working with {@link Annotation}s.\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TO_STRING_STYLE"
      ],
      "begin_line": 33,
      "end_line": 78,
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
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-398294b7-2e54-4d83-8964-c0a57f1e8462.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 53,
      "end_line": 66,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 62)",
        "(line 55,col 13)-(line 63,col 13)",
        "(line 64,col 13)-(line 65,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-1e8896ef-50fd-4725-915f-d2a634e449bc.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 72,col 13)-(line 74,col 13)",
        "(line 75,col 13)-(line 75,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.AnnotationUtils.AnnotationUtils()",
      "begin_line": 87,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eAnnotationUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used statically.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.equals(java.lang.annotation.Annotation, java.lang.annotation.Annotation)",
      "begin_line": 98,
      "end_line": 127,
      "comment": "\n     * Learn whether two annotations are equivalent; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#equals(Object)}\n     * per spec.\n     * @param a1 the first Annotation to compare\n     * @param a2 the second Annotation to compare\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 107,col 79)",
        "(line 108,col 9)-(line 108,col 80)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashCode(java.lang.annotation.Annotation)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * Generate a hashcode for the given annotation; dynamically created\n     * {@link Annotation} instances are always proxy objects which cannot be\n     * depended upon to know how to implement {@link Annotation#hashCode()} per\n     * spec.\n     * \n     * @param a the Annotation for a hashcode calculation is desired\n     * @return the calculated hashcode\n     * @throws InvocationTargetException\n     * @throws IllegalAccessException\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 23)",
        "(line 144,col 9)-(line 144,col 62)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.toString(java.lang.annotation.Annotation)",
      "begin_line": 157,
      "end_line": 172,
      "comment": "\n     * Generate a string representation of an Annotation, as suggested by\n     * {@link Annotation#toString()}.\n     * @param a the annotation of which a string representation is desired\n     * @return String\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 74)",
        "(line 159,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class\u003c?\u003e)",
      "begin_line": 181,
      "end_line": 190,
      "comment": "\n     * Learn whether the specified type is permitted as an annotation member.\n     * These include {@link String}, {@link Class}, primitive types,\n     * {@link Annotation}s, {@link Enum}s, and arrays of same.\n     * @param type to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 189,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashMember(java.lang.String, java.lang.Object)",
      "begin_line": 193,
      "end_line": 206,
      "comment": "besides modularity, this has the advantage of autoboxing primitives:",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.memberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 208,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 224,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(java.lang.annotation.Annotation[], java.lang.annotation.Annotation[])",
      "begin_line": 255,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 267,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 45)"
      ]
    }
  ]
}
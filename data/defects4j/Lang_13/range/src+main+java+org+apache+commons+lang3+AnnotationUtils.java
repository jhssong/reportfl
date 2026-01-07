{
  "filepath": "/tmp/Lang-13b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 371,
      "comment": "\n * \u003cp\u003eHelper methods for working with {@link Annotation} instances.\u003c/p\u003e\n *\n * \u003cp\u003eThis class contains various utility methods that make working with\n * annotations simpler.\u003c/p\u003e\n *\n * \u003cp\u003e{@link Annotation} instances are always proxy objects; unfortunately\n * dynamic proxies cannot be depended upon to know how to implement certain\n * methods in the same manner as would be done by \"natural\" {@link Annotation}s.\n * The methods presented in this class can be used to avoid that possibility. It\n * is of course also possible for dynamic proxies to actually delegate their\n * e.g. {@link Annotation#equals(Object)}/{@link Annotation#hashCode()}/\n * {@link Annotation#toString()} implementations to {@link AnnotationUtils}.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TO_STRING_STYLE"
      ],
      "begin_line": 51,
      "end_line": 98,
      "comment": "\n     * A style that prints annotations as recommended.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-6bfcb3f2-c289-4eb9-96e5-305a2353c890.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 71,
      "end_line": 85,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 62)",
        "(line 74,col 13)-(line 82,col 13)",
        "(line 83,col 13)-(line 84,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.Anonymous-3774e4c3-9b4c-425f-a24a-50e3e3309066.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 92,col 13)-(line 94,col 13)",
        "(line 95,col 13)-(line 95,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.AnnotationUtils.AnnotationUtils()",
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003e{@code AnnotationUtils} instances should NOT be constructed in\n     * standard programming. Instead, the class should be used statically.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.equals(java.lang.annotation.Annotation, java.lang.annotation.Annotation)",
      "begin_line": 122,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eChecks if two annotations are equal using the criteria for equality\n     * presented in the {@link Annotation#equals(Object)} API docs.\u003c/p\u003e\n     *\n     * @param a1 the first Annotation to compare, {@code null} returns\n     * {@code false} unless both are {@code null}\n     * @param a2 the second Annotation to compare, {@code null} returns\n     * {@code false} unless both are {@code null}\n     * @return {@code true} if the two annotations are {@code equal} or both\n     * {@code null}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 63)",
        "(line 130,col 9)-(line 130,col 64)",
        "(line 131,col 9)-(line 131,col 79)",
        "(line 132,col 9)-(line 132,col 80)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashCode(java.lang.annotation.Annotation)",
      "begin_line": 167,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eGenerate a hash code for the given annotation using the algorithm\n     * presented in the {@link Annotation#hashCode()} API docs.\u003c/p\u003e\n     *\n     * @param a the Annotation for a hash code calculation is desired, not\n     * {@code null}\n     * @return the calculated hash code\n     * @throws RuntimeException if an {@code Exception} is encountered during\n     * annotation member access\n     * @throws IllegalStateException if an annotation method invocation returns\n     * {@code null}\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 23)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 170,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.toString(java.lang.annotation.Annotation)",
      "begin_line": 195,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGenerate a string representation of an Annotation, as suggested by\n     * {@link Annotation#toString()}.\u003c/p\u003e\n     *\n     * @param a the annotation of which a string representation is desired\n     * @return the standard string representation of an annotation, not\n     * {@code null}\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 74)",
        "(line 197,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class\u003c?\u003e)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eChecks if the specified type is permitted as an annotation member.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Java language specification only permits certain types to be used\n     * in annotations. These include {@link String}, {@link Class}, primitive\n     * types, {@link Annotation}, {@link Enum}, and single-dimensional arrays of\n     * these types.\u003c/p\u003e\n     *\n     * @param type the type to check, {@code null}\n     * @return {@code true} if the type is a valid type to use in an annotation\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 231,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.hashMember(java.lang.String, java.lang.Object)",
      "begin_line": 242,
      "end_line": 251,
      "comment": "\n     * Helper method for generating a hash code for a member of an annotation.\n     *\n     * @param name the name of the member\n     * @param value the value of the member\n     * @return a hash code for this member\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 42)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.memberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 263,
      "end_line": 277,
      "comment": "\n     * Helper method for checking whether two objects of the given type are\n     * equal. This method is used to compare the parameters of two annotation\n     * instances.\n     *\n     * @param type the type of the objects to be compared\n     * @param o1 the first object\n     * @param o2 the second object\n     * @return a flag whether these objects are equal\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 287,
      "end_line": 316,
      "comment": "\n     * Helper method for comparing two objects of an array type.\n     *\n     * @param componentType the component type of the array\n     * @param o1 the first object\n     * @param o2 the second object\n     * @return a flag whether these objects are equal\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(java.lang.annotation.Annotation[], java.lang.annotation.Annotation[])",
      "begin_line": 325,
      "end_line": 335,
      "comment": "\n     * Helper method for comparing two arrays of annotations.\n     *\n     * @param a1 the first array\n     * @param a2 the second array\n     * @return a flag whether these arrays are equal\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 344,
      "end_line": 370,
      "comment": "\n     * Helper method for generating a hash code for an array.\n     *\n     * @param componentType the component type of the array\n     * @param o the array\n     * @return a hash code for the specified array\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 45)"
      ]
    }
  ]
}
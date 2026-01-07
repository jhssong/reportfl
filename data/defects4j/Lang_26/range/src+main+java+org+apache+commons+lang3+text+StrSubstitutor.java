{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 857,
      "comment": "\n * Substitutes variables within a string by values.\n * \u003cp\u003e\n * This class takes a piece of text and substitutes all the variables within it.\n * The default definition of a variable is \u003ccode\u003e${variableName}\u003c/code\u003e.\n * The prefix and suffix can be changed via constructors and set methods.\n * \u003cp\u003e\n * Variable values are typically resolved from a map, but could also be resolved\n * from system properties, or by supplying a custom variable resolver.\n * \u003cp\u003e\n * The simplest example is to use this class to replace Java System properties. For example:\n * \u003cpre\u003e\n * StrSubstitutor.replaceSystemProperties(\n *      \"You are running with java.version \u003d ${java.version} and os.name \u003d ${os.name}.\");\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Typical usage of this class follows the following pattern: First an instance is created\n * and initialized with the map that contains the values for the available variables.\n * If a prefix and/or suffix for variables should be used other than the default ones,\n * the appropriate settings can be performed. After that the \u003ccode\u003ereplace()\u003c/code\u003e\n * method can be called passing in the source text for interpolation. In the returned\n * text all variable references (as long as their values are known) will be resolved.\n * The following example demonstrates this:\n * \u003cpre\u003e\n * Map valuesMap \u003d HashMap();\n * valuesMap.put(\u0026quot;animal\u0026quot;, \u0026quot;quick brown fox\u0026quot;);\n * valuesMap.put(\u0026quot;target\u0026quot;, \u0026quot;lazy dog\u0026quot;);\n * String templateString \u003d \u0026quot;The ${animal} jumped over the ${target}.\u0026quot;;\n * StrSubstitutor sub \u003d new StrSubstitutor(valuesMap);\n * String resolvedString \u003d sub.replace(templateString);\n * \u003c/pre\u003e\n * yielding:\n * \u003cpre\u003e\n *      The quick brown fox jumped over the lazy dog.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In addition to this usage pattern there are some static convenience methods that\n * cover the most common use cases. These methods can be used without the need of\n * manually creating an instance. However if multiple replace operations are to be\n * performed, creating and reusing an instance of this class will be more efficient.\n * \u003cp\u003e\n * Variable replacement works in a recursive way. Thus, if a variable value contains\n * a variable then that variable will also be replaced. Cyclic replacements are\n * detected and will cause an exception to be thrown.\n * \u003cp\u003e\n * Sometimes the interpolation\u0027s result must contain a variable prefix. As an example\n * take the following source text:\n * \u003cpre\u003e\n *   The variable ${${name}} must be used.\n * \u003c/pre\u003e\n * Here only the variable\u0027s name refered to in the text should be replaced resulting\n * in the text (assuming that the value of the \u003ccode\u003ename\u003c/code\u003e variable is \u003ccode\u003ex\u003c/code\u003e):\n * \u003cpre\u003e\n *   The variable ${x} must be used.\n * \u003c/pre\u003e\n * To achieve this effect there are two possibilities: Either set a different prefix\n * and suffix for variables which do not conflict with the result text you want to\n * produce. The other possibility is to use the escape character, by default \u0027$\u0027.\n * If this character is placed before a variable reference, this reference is ignored\n * and won\u0027t be replaced. For example:\n * \u003cpre\u003e\n *   The variable $${${name}} must be used.\n * \u003c/pre\u003e\n *\n * @author Apache Software Foundation\n * @author Oliver Heger\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Constant for the default escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Constant for the default variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Constant for the default variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeChar"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Stores the escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefixMatcher"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Stores the variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "suffixMatcher"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Stores the variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "variableResolver"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Variable resolution is delegated to an implementor of VariableResolver.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map. This method allows to specifiy a\n     * custom variable prefix and suffix\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @param prefix  the prefix of variables, not null\n     * @param suffix  the suffix of variables, not null\n     * @return the result of the replace operation\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Properties)",
      "begin_line": 164,
      "end_line": 178,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with their matching\n     * values from the properties.\n     * \n     * @param source the source text containing the variables to substitute, null returns null\n     * @param properties the properties with values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 67)",
        "(line 170,col 9)-(line 170,col 67)",
        "(line 171,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(java.lang.Object)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the system properties.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Creates a new instance with defaults for variable prefix and suffix\n     * and the escaping character.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Creates a new instance and initializes it. Uses defaults for variable\n     * prefix and suffix and the escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Creates a new instance and initializes it. Uses a default escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 253,
      "end_line": 258,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher, char)",
      "begin_line": 269,
      "end_line": 275,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefixMatcher  the prefix for variables, not null\n     * @param suffixMatcher  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 51)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 273,col 53)",
        "(line 274,col 9)-(line 274,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String)",
      "begin_line": 285,
      "end_line": 294,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     *\n     * @param source  the string to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String, int, int)",
      "begin_line": 308,
      "end_line": 317,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     * \u003cp\u003e\n     * Only the specified portion of the string will be processed.\n     * The rest of the string is not processed, and is not returned.\n     *\n     * @param source  the string to replace in, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 79)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[])",
      "begin_line": 328,
      "end_line": 335,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 70)",
        "(line 333,col 9)-(line 333,col 42)",
        "(line 334,col 9)-(line 334,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[], int, int)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the array will be processed.\n     * The rest of the array is not processed, and is not returned.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 79)",
        "(line 355,col 9)-(line 355,col 35)",
        "(line 356,col 9)-(line 356,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer)",
      "begin_line": 368,
      "end_line": 375,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 72)",
        "(line 373,col 9)-(line 373,col 41)",
        "(line 374,col 9)-(line 374,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer, int, int)",
      "begin_line": 390,
      "end_line": 397,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, and is not returned.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 79)",
        "(line 395,col 9)-(line 395,col 35)",
        "(line 396,col 9)-(line 396,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 408,
      "end_line": 415,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 72)",
        "(line 413,col 9)-(line 413,col 41)",
        "(line 414,col 9)-(line 414,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 430,
      "end_line": 437,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, and is not returned.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 79)",
        "(line 435,col 9)-(line 435,col 35)",
        "(line 436,col 9)-(line 436,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object)",
      "begin_line": 448,
      "end_line": 455,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the resolver. The input source object is\n     * converted to a string using \u003ccode\u003etoString\u003c/code\u003e and is not altered.\n     *\n     * @param source  the source to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 57)",
        "(line 453,col 9)-(line 453,col 41)",
        "(line 454,col 9)-(line 454,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer)",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer, int, int)",
      "begin_line": 486,
      "end_line": 496,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 79)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 64)",
        "(line 495,col 9)-(line 495,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 506,
      "end_line": 511,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     *\n     * @param source  the builder to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 525,
      "end_line": 530,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, but it is not deleted.\n     *\n     * @param source  the builder to replace in, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Internal method that substitutes the variables.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method will\n     * be called automatically by another (public) method.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need access to\n     * the substitution process at the start or end.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 563,
      "end_line": 640,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @param priorVariables  the stack keeping track of the replaced variables, may be null\n     * @return the length change that occurs, unless priorVariables is null when the int\n     *  represents a boolean flag as to whether any change occurred.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 62)",
        "(line 565,col 9)-(line 565,col 62)",
        "(line 566,col 9)-(line 566,col 38)",
        "(line 568,col 9)-(line 568,col 47)",
        "(line 569,col 9)-(line 569,col 32)",
        "(line 570,col 9)-(line 570,col 29)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 37)",
        "(line 573,col 9)-(line 573,col 25)",
        "(line 574,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.checkCyclicSubstitution(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 648,
      "end_line": 658,
      "comment": "\n     * Checks if the specified variable is already in the stack (list) of variables.\n     *\n     * @param varName  the variable name to check\n     * @param priorVariables  the list of prior variables\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 45)",
        "(line 653,col 9)-(line 653,col 66)",
        "(line 654,col 9)-(line 654,col 45)",
        "(line 655,col 9)-(line 655,col 25)",
        "(line 656,col 9)-(line 656,col 55)",
        "(line 657,col 9)-(line 657,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 677,
      "end_line": 683,
      "comment": "\n     * Internal method that resolves the value of a variable.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method is\n     * called automatically by the substitution process.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need to alter\n     * how each substitution occurs. The method is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation uses the\n     * {@link #getVariableResolver()} with the variable\u0027s name as the key.\n     *\n     * @param variableName  the name of the variable, not null\n     * @param buf  the buffer where the substitution is occurring, not null\n     * @param startPos  the start position of the variable including the prefix, valid\n     * @param endPos  the end position of the variable including the suffix, valid\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 54)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getEscapeChar()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEscapeChar(char)",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     *\n     * @param escapeCharacter  the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariablePrefixMatcher()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\n     * Gets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @return the prefix matcher in use\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 733,
      "end_line": 739,
      "comment": "\n     * Sets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @param prefixMatcher  the prefix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix matcher is null\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 738,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(char)",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a single character prefix to\n     * be easily set.\n     *\n     * @param prefix  the prefix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(java.lang.String)",
      "begin_line": 765,
      "end_line": 770,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a string prefix to be easily set.\n     *\n     * @param prefix  the prefix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix is null\n     ",
      "child_ranges": [
        "(line 766,col 8)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableSuffixMatcher()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * Gets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @return the suffix matcher in use\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 798,
      "end_line": 804,
      "comment": "\n     * Sets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @param suffixMatcher  the suffix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix matcher is null\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 43)",
        "(line 803,col 9)-(line 803,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(char)",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a single character suffix to\n     * be easily set.\n     *\n     * @param suffix  the suffix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(java.lang.String)",
      "begin_line": 830,
      "end_line": 835,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a string suffix to be easily set.\n     *\n     * @param suffix  the suffix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix is null\n     ",
      "child_ranges": [
        "(line 831,col 8)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableResolver()",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * Gets the VariableResolver that is used to lookup variables.\n     *\n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableResolver(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 853,
      "end_line": 855,
      "comment": "\n     * Sets the VariableResolver that is used to lookup variables.\n     *\n     * @param variableResolver  the VariableResolver\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 49)"
      ]
    }
  ]
}
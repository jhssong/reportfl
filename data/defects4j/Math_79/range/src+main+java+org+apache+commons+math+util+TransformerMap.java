{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/util/TransformerMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformerMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.NumberTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 193,
      "comment": "\n * This TansformerMap automates the transformation of mixed object types.\n * It provides a means to set NumberTransformers that will be selected\n * based on the Class of the object handed to the Maps\n * \u003ccode\u003edouble transform(Object o)\u003c/code\u003e method.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "defaultTransformer"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * A default Number Transformer for Numbers and numeric Strings.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The internal Map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.TransformerMap.TransformerMap()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Build a map containing only the default transformer.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 57)",
        "(line 54,col 9)-(line 54,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.containsClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Tests if a Class is present in the TransformerMap.\n     * @param key Class to check\n     * @return true|false\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.containsTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Tests if a NumberTransformer is present in the TransformerMap.\n     * @param value NumberTransformer to check\n     * @return true|false\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.getTransformer(java.lang.Class\u003c?\u003e)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the Transformer that is mapped to a class\n     * if mapping is not present, this returns null.\n     * @param key The Class of the object\n     * @return the mapped NumberTransformer or null.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.putTransformer(java.lang.Class\u003c?\u003e, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Sets a Class to Transformer Mapping in the Map. If\n     * the Class is already present, this overwrites that\n     * mapping.\n     * @param key The Class\n     * @param transformer The NumberTransformer\n     * @return the replaced transformer if one is present\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.removeTransformer(java.lang.Class\u003c?\u003e)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Removes a Class to Transformer Mapping in the Map.\n     * @param key The Class\n     * @return the removed transformer if one is present or\n     * null if none was present.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.clear()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Clears all the Class to Transformer mappings.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.classes()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the Set of Classes used as keys in the map.\n     * @return Set of Classes\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.transformers()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns the Set of NumberTransformers used as values\n     * in the map.\n     * @return Set of NumberTransformers\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.transform(java.lang.Object)",
      "begin_line": 140,
      "end_line": 153,
      "comment": "\n     * Attempts to transform the Object against the map of\n     * NumberTransformers. Otherwise it returns Double.NaN.\n     *\n     * @param o the Object to be transformed.\n     * @return the double value of the Object.\n     * @throws MathException if the Object can not be transformed into a Double.\n     * @see org.apache.commons.math.util.NumberTransformer#transform(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 34)",
        "(line 143,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.hashCode()",
      "begin_line": 184,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 49)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    }
  ]
}
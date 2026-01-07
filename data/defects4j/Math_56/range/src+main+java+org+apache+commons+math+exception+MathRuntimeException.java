{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/exception/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 40,
      "end_line": 301,
      "comment": "\n * This class is the base class for all exceptions.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "msgPatterns"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Various informations that enrich the informative message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "msgArguments"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Various informations that enrich the informative message.\n     * The arguments will replace the corresponding place-holders in\n     * {@link #msgPatterns}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Arbitrary context information.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Builds an exception.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Builds an exception.\n     *\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 75,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 78,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getContext(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getContextKeys()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage(java.util.Locale, java.lang.String)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Separator inserted between the message parts.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.buildMessage(java.util.Locale, java.lang.String)",
      "begin_line": 137,
      "end_line": 155,
      "comment": "\n     * Builds a message string.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Message separator.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 53)",
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 141,col 43)",
        "(line 142,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * Serialize this object to the given stream.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 166,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.readObject(java.io.ObjectInputStream)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * Deserialize this object from the given stream.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 179,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.serializeMessages(java.io.ObjectOutputStream)",
      "begin_line": 188,
      "end_line": 212,
      "comment": "\n     * Serialize  {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 26)",
        "(line 194,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.deSerializeMessages(java.io.ObjectInputStream)",
      "begin_line": 221,
      "end_line": 242,
      "comment": "\n     * Deserialize {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 54)",
        "(line 227,col 9)-(line 227,col 52)",
        "(line 229,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.serializeContext(java.io.ObjectOutputStream)",
      "begin_line": 250,
      "end_line": 267,
      "comment": "\n     * Serialize {@link #context}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 48)",
        "(line 254,col 9)-(line 254,col 26)",
        "(line 255,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.deSerializeContext(java.io.ObjectInputStream)",
      "begin_line": 276,
      "end_line": 289,
      "comment": "\n     * Deserialize {@link #context}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 37)",
        "(line 281,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.nonSerializableReplacement(java.lang.Object)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Replaces a non-serializable object with an error message string.\n     *\n     * @param obj Object that does not implement the {@code Serializable\n     * interface\n     * @return a string that mentions which class could not be serialized.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 84)"
      ]
    }
  ]
}
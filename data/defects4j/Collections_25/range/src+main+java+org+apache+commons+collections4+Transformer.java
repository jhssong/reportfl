{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/Transformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Transformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 51,
      "comment": "\n * Defines a functor interface implemented by classes that transform one\n * object into another.\n * \u003cp\u003e\n * A \u003ccode\u003eTransformer\u003c/code\u003e converts the input object to the output object.\n * The input object should be left unchanged.\n * Transformers are typically used for type conversions, or extracting data\n * from an object.\n * \u003cp\u003e\n * Standard implementations of common transformers are provided by\n * {@link TransformerUtils}. These include method invocation, returning a constant,\n * cloning and returning the string value.\n *\n * @param \u003cI\u003e the input type to the transformer\n * @param \u003cO\u003e the output type from the transformer\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Transformer.transform(I)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Transforms the input object (leaving it unchanged) into some output object.\n     *\n     * @param input  the object to be transformed, should be left unchanged\n     * @return a transformed object\n     * @throws ClassCastException (runtime) if the input is the wrong class\n     * @throws IllegalArgumentException (runtime) if the input is invalid\n     * @throws FunctorException (runtime) if the transform cannot be completed\n     ",
      "child_ranges": []
    }
  ]
}
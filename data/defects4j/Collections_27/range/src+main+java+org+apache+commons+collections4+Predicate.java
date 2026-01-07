{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/Predicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Predicate",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 49,
      "comment": "\n * Defines a functor interface implemented by classes that perform a predicate\n * test on an object.\n * \u003cp\u003e\n * A \u003ccode\u003ePredicate\u003c/code\u003e is the object equivalent of an \u003ccode\u003eif\u003c/code\u003e statement.\n * It uses the input object to return a true or false value, and is often used in\n * validation or filtering.\n * \u003cp\u003e\n * Standard implementations of common predicates are provided by\n * {@link PredicateUtils}. These include true, false, instanceof, equals, and,\n * or, not, method invokation and null testing.\n *\n * @param \u003cT\u003e the type that the predicate queries\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Predicate.evaluate(T)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Use the specified parameter to perform a test that returns true or false.\n     *\n     * @param object  the object to evaluate, should not be changed\n     * @return true or false\n     * @throws ClassCastException (runtime) if the input is the wrong class\n     * @throws IllegalArgumentException (runtime) if the input is invalid\n     * @throws FunctorException (runtime) if the predicate encounters a problem\n     ",
      "child_ranges": []
    }
  ]
}
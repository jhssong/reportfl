{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/Builder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 89,
      "comment": "\n * \u003cp\u003e\n * The Builder interface is designed to designate a class as a \u003cem\u003ebuilder\u003c/em\u003e \n * object in the Builder design pattern. Builders are capable of creating and \n * configuring objects or results that normally take multiple steps to construct \n * or are very complex to derive. \n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * The builder interface defines a single method, {@link #build()}, that \n * classes must implement. The result of this method should be the final \n * configured object or result after all building operations are performed.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * It is a recommended practice that the methods supplied to configure the \n * object or result being built return a reference to {@code this} so that\n * method calls can be chained together.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Example Builder:\n * \u003ccode\u003e\u003cpre\u003e\n * class FontBuilder implements Builder\u0026lt;Font\u0026gt; {\n *     private Font font;\n *     \n *     public FontBuilder(String fontName) {\n *         this.font \u003d new Font(fontName, Font.PLAIN, 12);\n *     }\n * \n *     public FontBuilder bold() {\n *         this.font \u003d this.font.deriveFont(Font.BOLD);\n *         return this; // Reference returned so calls can be chained\n *     }\n *     \n *     public FontBuilder size(float pointSize) {\n *         this.font \u003d this.font.deriveFont(pointSize);\n *         return this; // Reference returned so calls can be chained\n *     }\n * \n *     // Other Font construction methods\n * \n *     public Font build() {\n *         return this.font;\n *     }\n * }\n * \u003c/pre\u003e\u003c/code\u003e\n * \n * Example Builder Usage:\n * \u003ccode\u003e\u003cpre\u003e\n * Font bold14ptSansSerifFont \u003d new FontBuilder(Font.SANS_SERIF).bold()\n *                                                              .size(14.0f)\n *                                                              .build();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003c/p\u003e\n * \n * @param \u003cT\u003e the type of object that the builder will construct or compute.\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.Builder.build()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Returns a reference to the object being constructed or result being \n     * calculated by the builder.\n     * \n     * @return the object constructed or result calculated by the builder.\n     ",
      "child_ranges": []
    }
  ]
}
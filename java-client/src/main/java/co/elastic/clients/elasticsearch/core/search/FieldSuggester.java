/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FieldSuggester
// union type: Container[]
@JsonpDeserializable
public class FieldSuggester implements TaggedUnion<Object>, JsonpSerializable {

	public static final String COMPLETION = "completion";
	public static final String PHRASE = "phrase";
	public static final String PREFIX = "prefix";
	public static final String REGEX = "regex";
	public static final String TERM = "term";
	public static final String TEXT = "text";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public FieldSuggester(FieldSuggesterVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private FieldSuggester(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldSuggester of(Function<Builder, ObjectBuilder<FieldSuggester>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code completion}?
	 */
	public boolean _isCompletion() {
		return COMPLETION.equals(_type());
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionSuggester completion() {
		return TaggedUnionUtils.get(this, COMPLETION);
	}

	/**
	 * Is this variant instance of kind {@code phrase}?
	 */
	public boolean _isPhrase() {
		return PHRASE.equals(_type());
	}

	/**
	 * Get the {@code phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phrase} kind.
	 */
	public PhraseSuggester phrase() {
		return TaggedUnionUtils.get(this, PHRASE);
	}

	/**
	 * Is this variant instance of kind {@code prefix}?
	 */
	public boolean _isPrefix() {
		return PREFIX.equals(_type());
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public String prefix() {
		return TaggedUnionUtils.get(this, PREFIX);
	}

	/**
	 * Is this variant instance of kind {@code regex}?
	 */
	public boolean _isRegex() {
		return REGEX.equals(_type());
	}

	/**
	 * Get the {@code regex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regex} kind.
	 */
	public String regex() {
		return TaggedUnionUtils.get(this, REGEX);
	}

	/**
	 * Is this variant instance of kind {@code term}?
	 */
	public boolean _isTerm() {
		return TERM.equals(_type());
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermSuggester term() {
		return TaggedUnionUtils.get(this, TERM);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean _isText() {
		return TEXT.equals(_type());
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, TEXT);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case PREFIX :
					generator.write(((String) this._value));

					break;
				case REGEX :
					generator.write(((String) this._value));

					break;
				case TEXT :
					generator.write(((String) this._value));

					break;
			}
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldSuggester> {
		private String _type;
		private Object _value;

		public Builder completion(CompletionSuggester v) {
			this._type = COMPLETION;
			this._value = v;
			return this;
		}

		public Builder completion(Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> f) {
			return this.completion(f.apply(new CompletionSuggester.Builder()).build());
		}

		public Builder phrase(PhraseSuggester v) {
			this._type = PHRASE;
			this._value = v;
			return this;
		}

		public Builder phrase(Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> f) {
			return this.phrase(f.apply(new PhraseSuggester.Builder()).build());
		}

		public Builder prefix(String v) {
			this._type = PREFIX;
			this._value = v;
			return this;
		}

		public Builder regex(String v) {
			this._type = REGEX;
			this._value = v;
			return this;
		}

		public Builder term(TermSuggester v) {
			this._type = TERM;
			this._value = v;
			return this;
		}

		public Builder term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> f) {
			return this.term(f.apply(new TermSuggester.Builder()).build());
		}

		public Builder text(String v) {
			this._type = TEXT;
			this._value = v;
			return this;
		}

		public FieldSuggester build() {
			_checkSingleUse();
			return new FieldSuggester(this);
		}

	}

	protected static void setupFieldSuggesterDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::completion, CompletionSuggester._DESERIALIZER, "completion");
		op.add(Builder::phrase, PhraseSuggester._DESERIALIZER, "phrase");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::term, TermSuggester._DESERIALIZER, "term");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

	public static final JsonpDeserializer<FieldSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldSuggester::setupFieldSuggesterDeserializer, Builder::build);
}
package no.hal.pg.http;

import java.util.Collection;
import java.util.Map;

import no.hal.pg.http.auth.ISubjectProvider;

public interface IRequestQueryExecutor {
	public void setSubjectProvider(ISubjectProvider<?> subjectProvider);
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters);
}
